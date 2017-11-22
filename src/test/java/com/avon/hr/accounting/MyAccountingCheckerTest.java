package com.avon.hr.accounting;

import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by yangyongli on 04/12/2016.
 */
public class MyAccountingCheckerTest {

    Logger logger = Logger.getLogger(MyAccountingCheckerTest.class);

    MyAccounting m = new MyAccounting();

    @Before
    public void setup() {

    }

    @Test
    public void check1() throws Exception {
        String e = "a = 1; return a;";
        CheckResult result = m.check(e, null);
        assertTrue(result.isPass());
    }

    @Test
    public void check2() throws Exception {
        String e = "a = 1; return b;";
        CheckResult result = m.check(e, null);
        assertFalse(result.isPass());
        logger.debug(result);
        List<String> needVariables = result.getNeedVariables();
        assertTrue(needVariables.contains("b"));
    }


    @Test
    public void check2_1() throws Exception {
        String e = "a = 1; return 函数(a);";
        CheckResult result = m.check(e, null);
        assertFalse(result.isPass());
        logger.debug(result);
        List<String> needFunctions = result.getNeedFunctions();
        assertTrue(needFunctions.contains("函数"));
    }


    @Test
    public void check3() throws Exception {
        String e = "if (计税模式 == 1) {\n" +
            "    计税金额 = 基本工资 - 社保缴费 - 800;\n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 20000) {\n" +
            "        个税 = 计税金额 * 0.2\n" +
            "    } else if (计税金额 < 50000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2000;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.4 - 7000;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "} else if (计税模式 > 5) {\n" +
            "    return 0;\n" +
            "} else {\n" +
            "    计税金额 = -1\n" +
            "    if (计税模式 == 2) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 3500;\n" +
            "    } else if (计税模式 == 3) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 4800;\n" +
            "    } \n" +
            "    else if (计税模式 == 4){\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 7500;\n" +
            "    } else {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 5300;\n" +
            "    }   \n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 1500) {\n" +
            "        个税 = 计税金额 * 0.03\n" +
            "    } else if (计税金额 < 4500) {\n" +
            "        个税 = 计税金额 * 0.1 - 105;\n" +
            "    } else if (计税金额 < 9000) {\n" +
            "        个税 = 计税金额 * 0.2 - 555;\n" +
            "    } else if (计税金额 < 35000) {\n" +
            "        个税 = 计税金额 * 0.25 - 1005;\n" +
            "    } else if (计税金额 < 55000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2755;\n" +
            "    } else if (计税金额 < 80000) {\n" +
            "        个税 = 计税金额 * 0.35 - 5505;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.45 - 13505;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "}\n";
        CheckResult result = m.check(e, null);
        logger.debug(result);
        assertNotNull(result);
        assertFalse(result.isPass());
        List<String> needVariables = result.getNeedVariables();
        assertTrue(needVariables.contains("基本工资"));
        assertTrue(needVariables.contains("社保缴费"));
        assertTrue(needVariables.contains("计税模式"));
    }


    @Test
    public void check4() throws Exception {
        String e = "if (计税模式 == 1) {\n" +
            "    计税金额 = 基本工资 - 社保缴费 - 800;\n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 20000) {\n" +
            "        个税 = 计税金额 * 0.2\n" +
            "    } else if (计税金额 < 50000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2000;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.4 - 7000;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "} else if (计税模式 > 5) {\n" +
            "    return 0;\n" +
            "} else {\n" +
            "    计税金额 = -1\n" +
            "    if (计税模式 == 2) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 3500;\n" +
            "    } else if (计税模式 == 3) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 4800;\n" +
            "    } \n" +
            "    else if (计税模式 == 4){\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 7500;\n" +
            "    } else {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 5300;\n" +
            "    }   \n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 1500) {\n" +
            "        个税 = 计税金额 * 0.03\n" +
            "    } else if (计税金额 < 4500) {\n" +
            "        个税 = 计税金额 * 0.1 - 105;\n" +
            "    } else if (计税金额 < 9000) {\n" +
            "        个税 = 计税金额 * 0.2 - 555;\n" +
            "    } else if (计税金额 < 35000) {\n" +
            "        个税 = 计税金额 * 0.25 - 1005;\n" +
            "    } else if (计税金额 < 55000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2755;\n" +
            "    } else if (计税金额 < 80000) {\n" +
            "        个税 = 计税金额 * 0.35 - 5505;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.45 - 13505;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "}\n";
        Map<String, BigDecimal> variables = Maps.newHashMap();
        variables.put("计税模式", BigDecimal.ONE);
        CheckResult result = m.check(e, variables);
        logger.debug(result);
        assertNotNull(result);
        assertFalse(result.isPass());
        List<String> needVariables = result.getNeedVariables();
        assertTrue(needVariables.contains("基本工资"));
        assertTrue(needVariables.contains("社保缴费"));
        assertFalse(needVariables.contains("计税模式"));

    }


    @Test
    public void check5() throws Exception {
        String e = "if (计税模式 == 1) {\n" +
            "    计税金额 = 基本工资 - 社保缴费 - 800;\n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 20000) {\n" +
            "        个税 = 计税金额 * 0.2\n" +
            "    } else if (计税金额 < 50000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2000;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.4 - 7000;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "} else if (计税模式 > 5) {\n" +
            "    return 0;\n" +
            "} else {\n" +
            "    计税金额 = -1\n" +
            "    if (计税模式 == 2) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 3500;\n" +
            "    } else if (计税模式 == 3) {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 4800;\n" +
            "    } \n" +
            "    else if (计税模式 == 4){\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 7500;\n" +
            "    } else {\n" +
            "        计税金额 = 基本工资 - 社保缴费 - 5300;\n" +
            "    }   \n" +
            "    if (计税金额 < 0) {\n" +
            "        个税 = 0\n" +
            "    } else if (计税金额 < 1500) {\n" +
            "        个税 = 计税金额 * 0.03\n" +
            "    } else if (计税金额 < 4500) {\n" +
            "        个税 = 计税金额 * 0.1 - 105;\n" +
            "    } else if (计税金额 < 9000) {\n" +
            "        个税 = 计税金额 * 0.2 - 555;\n" +
            "    } else if (计税金额 < 35000) {\n" +
            "        个税 = 计税金额 * 0.25 - 1005;\n" +
            "    } else if (计税金额 < 55000) {\n" +
            "        个税 = 计税金额 * 0.3 - 2755;\n" +
            "    } else if (计税金额 < 80000) {\n" +
            "        个税 = 计税金额 * 0.35 - 5505;\n" +
            "    } else {\n" +
            "        个税 = 计税金额 * 0.45 - 13505;\n" +
            "    } \n" +
            "    return 个税;\n" +
            "}\n";
        Map<String, BigDecimal> variables = Maps.newHashMap();
        variables.put("基本工资", BigDecimal.ONE);
        variables.put("社保缴费", BigDecimal.ONE);
        variables.put("计税模式", BigDecimal.ONE);
        CheckResult result = m.check(e, variables);
        logger.debug(result);
        assertNotNull(result);
        assertTrue(result.isPass());
        List<String> needVariables = result.getNeedVariables();
        assertFalse(needVariables.contains("基本工资"));
        assertFalse(needVariables.contains("社保缴费"));
        assertFalse(needVariables.contains("计税模式"));
    }
}
