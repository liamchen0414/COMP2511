package stack.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // type safe example
        // ArrayList<Object> SatelliteList = new ArrayList<>();
        // SatelliteList.add(new Device());
        // Satellite s = (Satellite) SatelliteList.get(0);

        IntPrinter<String> printer = new IntPrinter<>("hello");
        printer.print();

        // below code doesn't work, need to replace Number with ?
        List<Integer> intList = new ArrayList<>();
        intList.add(42);
        printList(intList);
    }

    private static void printList(List<? extends Number> myList){
        System.out.println(myList);
    }
}

