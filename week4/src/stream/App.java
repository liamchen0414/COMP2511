package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        // for (String string : strings) {
        //     System.out.println(string);
        // }
        // lambda:
        // int x = 0;
        strings.forEach(e -> System.out.println(e));
        strings.forEach(e -> {
            // x += 1;
            // you can't access x because you are inside of a function, lambda function
            System.out.println(e);
        });
        strings.stream().forEach(e->System.out.println(e));

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = strings2.stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
        // scope operator
        List<Integer> ints2 = strings2.stream().map(Integer::parseInt).collect(Collectors.toList());
        // we are not breaking law of demeter, we are just calling successor methods
        // new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
    }
}