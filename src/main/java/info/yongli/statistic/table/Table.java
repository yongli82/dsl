package info.yongli.statistic.table;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.List;

/**
 * Created by yangyongli on 23/04/2017.
 */
@Data
public class Table implements Cloneable{

    private List<Column> columnList = Lists.newArrayList();

    private List<Row> rowList = Lists.newArrayList();

    public Table initialColumn(List<String> columnNames){
        for (String columnName : columnNames) {
            Column column = new Column();
            column.setName(columnName);
            columnList.add(column);
        }

        return this;
    }
    public Column getColumnByName(String columnName){
        for (Column column : columnList) {
            String name = column.getName();
            if(name.equals(columnName)){
                return column;
            }
        }

        return null;
    }

    List<Row> filterRows(Column column, Predicate predicate){
        List<Row> rows = Lists.newArrayList();
        for (Row row : rowList) {
            Cell cell = row.getCellByColumn(column);
            if(predicate.apply(cell.getValue())){
                rows.add(row);
            }
        }
        return rows;
    }

    Multimap<Object, Row> groupRows(Function<Row, Object> function){
        Multimap<Object, Row> map = ArrayListMultimap.create();
        for (Row row : rowList) {
            Object result = function.apply(row);
            map.put(result, row);
        }
        return map;
    }

    public Table addRow(List<Object> cellValues){
        Row row = new Row();

        for (int i = 0; i < cellValues.size(); i++) {
            Object cellValue = cellValues.get(i);
            Cell cell = new Cell();
            cell.setValue(cellValue);
            cell.setRow(row);
            row.getCells().add(cell);

            Column column = columnList.get(i);
            cell.setColumn(column);
            column.getCells().add(cell);
        }

        rowList.add(row);
        return this;
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for (Column column : columnList) {
            buffer.append(column.getName()).append(" | ");
        }
        buffer.append("\n");
        for (Row row : rowList) {
            List<Cell> cells = row.getCells();
            for (Cell cell : cells) {
                buffer.append(cell.getValue() == null ? "": cell.getValue()).append(" | ");
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

    public TableTransformer transformer(){
        return new TableTransformer(this);
    }

    public static class Column{
        private String name;

        private List<Cell> cells = Lists.newArrayList();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Cell> getCells() {
            return cells;
        }

        public void setCells(List<Cell> cells) {
            this.cells = cells;
        }
    }

    public static class Row{
        private List<Cell> cells = Lists.newArrayList();

        public List<Cell> getCells() {
            return cells;
        }

        public void setCells(List<Cell> cells) {
            this.cells = cells;
        }

        public Cell getCellByColumn(Column column){
            for (Cell cell : cells) {
                Column cellColumn = cell.getColumn();
                if(column.equals(cellColumn)){
                    return cell;
                }
            }
            return null;
        }

        public Cell getCellByColumn(String columnName){
            for (Cell cell : cells) {
                Column cellColumn = cell.getColumn();
                if(columnName.equals(cellColumn.getName())){
                    return cell;
                }
            }
            return null;
        }

        @Override
        public String toString(){
            StringBuffer buffer = new StringBuffer();
            for (Cell cell : cells) {
                buffer.append(cell.getValue() == null ? "": cell.getValue()).append(" | ");
            }
            return buffer.toString();
        }
    }

    public static class Cell{
        private Column column;
        private Row row;
        private Object value;

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Column getColumn() {
            return column;
        }

        public void setColumn(Column column) {
            this.column = column;
        }

        public Row getRow() {
            return row;
        }

        public void setRow(Row row) {
            this.row = row;
        }
    }
}
