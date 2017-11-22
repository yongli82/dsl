package groovy.dsl;

import com.google.common.collect.Lists;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.util.List;

/**
 * Created by yangyongli on 01/11/2017.
 */
public class CheckRuleDsl {

    public static void main(String[] args) {
        List<String> rules = Lists.newArrayList();
        rules.add("S <= 10");
        rules.add("S + A <= 20");
        rules.add("S + A + BP <= 55");
        rules.add("C >= 5");

        Binding binding = new Binding();
        binding.setVariable("S", 5.0);
        binding.setVariable("A", 5.0);
        binding.setVariable("BP", 30.0);
        binding.setVariable("B", 30.0);
        binding.setVariable("C", 30.0);
        GroovyShell shell = new GroovyShell(binding);
        for (String rule : rules) {
            Object result = shell.evaluate(rule);
            System.out.println(result);
        }
    }
}
