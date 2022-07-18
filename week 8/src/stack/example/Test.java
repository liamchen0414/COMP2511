package stack.example;

public class Test {
    public static void main(String[] args) {
        IntPrinter<Integer> printer = new IntPrinter<>(42);
        printer.print();
    }
}

