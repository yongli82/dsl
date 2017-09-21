package info.yongli.statistic.table;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by yangyongli on 23/04/2017.
 */
public class TableTest {
    private Table origin;
    @Before
    public void setUp() throws Exception {
        origin = new Table().initialColumn(Lists.newArrayList("Name", "Gender", "Age", "Score"));
        origin.addRow(Lists.newArrayList((Object)"Joe", "M", 40, 4.5));
        origin.addRow(Lists.newArrayList((Object)"Kate", "F", 30, 3.9));
        origin.addRow(Lists.newArrayList((Object)"Sim", "M", 25, 3.5));
        origin.addRow(Lists.newArrayList((Object)"Lily", "F", 20, 4.0));
        System.out.println(origin);
    }

    @Test
    public void testGroupBy() throws Exception {
        Table t1 = origin.transformer()
                .average("Age", "Age_Average")
                .average("Score", "Score_Average")
                .groupBy("Gender")
                .transform();
        System.out.println(t1);
    }

    @Test
    public void testGroupByManual() throws Exception {
        Table.Column gender = origin.getColumnByName("Gender");
        List<Table.Row> rowList = origin.filterRows(gender, new Predicate() {
            public boolean apply(Object input) {
                return "M".equals(input);
            }
        });

        System.out.println(rowList);

        Multimap<Object, Table.Row> groupRowMultiMap = origin.groupRows(new Function<Table.Row, Object>() {
            public Object apply(Table.Row input) {
                Table.Cell genderCell = input.getCellByColumn("Gender");
                Object value = genderCell.getValue();
                return value;
            }
        });

        Table mergeTable = new Table().initialColumn(Lists.newArrayList("Gender", "Age_Average", "Score_Average"));
        Map<Object, Collection<Table.Row>> asMap = groupRowMultiMap.asMap();
        Set<Map.Entry<Object, Collection<Table.Row>>> entries = asMap.entrySet();
        for (Map.Entry<Object, Collection<Table.Row>> entry : entries) {
            Object keyValue = entry.getKey();
            Collection<Table.Row> rows = entry.getValue();
        }


    }

    @Test
    public void testAverage() throws Exception {
        Table t1 = origin.transformer()
                .average("Age", "Age_average")
                .average("Score", "Score_Average")
                .transform();
        System.out.println(t1);
    }

}