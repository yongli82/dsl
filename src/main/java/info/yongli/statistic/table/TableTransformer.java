package info.yongli.statistic.table;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by yangyongli on 23/04/2017.
 */
public class TableTransformer {

    private Table originTable;

    private Table temporaryTable;

    private List<Table.Column> columns;

    private List<String> groupByList = Lists.newArrayList();

    private List<String> sumList = Lists.newArrayList();


    public TableTransformer(Table table){
        this.originTable = table;
    }

    public Table transform(){
        temporaryTable = originTable;

        return temporaryTable;
    }

    public TableTransformer groupBy(String column){
        groupByList.add(column);

        return this;
    }

    public TableTransformer average(String column, String newColumn){

        return this;
    }

    public TableTransformer sum(String column, String newColumn){

        return this;
    }

    public TableTransformer count(String column, String newColumn){

        return this;
    }

    public TableTransformer add(String column1, String column2, String resultColumn){

        return this;
    }

    public TableTransformer subtract(String column1, String column2, String resultColumn){

        return this;
    }

    public TableTransformer multiply(String column1, String column2, String resultColumn){

        return this;
    }

    public TableTransformer divide(String column1, String column2, String resultColumn){

        return this;
    }
}
