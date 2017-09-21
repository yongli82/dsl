package info.yongli.statistic.table;

import lombok.Data;

/**
 * Created by yangyongli on 25/04/2017.
 */
@Data
public class TableOperation {

    public Table execute(Table input){
        return null;
    }

    @Data
    public static class ColumnOperation{
        private String operation;
        private ColumnElement left;
        private ColumnElement right;

    }

    @Data
    public static class ColumnElement{
        private ElementType elementType;
        private String columnName;
        private Object value;
    }

    public static enum ElementType{
        COLUMN,
        VALUE,
    }

    public static enum OperationType{
        SUM,
        AVERAGE,
    }
}
