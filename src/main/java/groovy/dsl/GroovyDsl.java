package groovy.dsl;

import com.google.common.collect.Maps;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;

import java.util.Map;

/**
 * Created by yangyongli on 22/09/2017.
 */
public class GroovyDsl {

    public static void main(String[] args) {
        Binding binding = new Binding();
        binding.setVariable("A", 20.0);
        binding.setVariable("B", 30.0);
        binding.setVariable("weightA", 1.2);
        binding.setVariable("weightB", 0.8);
        GroovyShell shell = new GroovyShell(binding);
        Object result = shell.evaluate("A * weightA + B * weightB");
        System.out.println(result);


    }
}
