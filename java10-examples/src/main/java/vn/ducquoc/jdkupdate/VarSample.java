package vn.ducquoc.jdkupdate;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

/**
 * It took N year to step down from "elitism" to "convenience" without worrying about security or commodity trap.
 * <p></p>
 * Thumb up for Lombok project, after all. (https://projectlombok.org/features/all)
 */
public class VarSample {

    public static void main(String[] args) {

        System.out.println("Hello World");
        VarSample varSample = new VarSample();

        System.out.println(varSample.example());
        varSample.example2();
    }

    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

}
