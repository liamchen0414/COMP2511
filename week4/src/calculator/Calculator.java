package calculator;

public class Calculator {
    // What is Design by Contract?
    // client meets preconditions, for example, passenger arrive on time
    // ADT meets postconditions, the flight takes passenger to where they want to be
    // we don't have to program defensively

    // Discuss briefly as a class how you have used Design by Contract already in previous courses.
    // Discuss how Design By Contract was applied in the Blackout assignment.
    // assignment section 6/7

    // we don't need to defensively check if a and b are null
    /**
     * @precondition a,b != null
     * @postcondition a + b
     */
    public static Double add(Double a, Double b) {
        return a + b;
    }
    /**
     * @precondition a,b != null
     * @postcondition a + b
     */
    public static Double subtract(Double a, Double b) {
        return a - b;
    }
    /**
     * @precondition a,b != null
     * @postcondition a + b
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    /**
     * @precondition a,b != null and b != 0
     * @postcondition a + b
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

    public static void main(String[] args) {
        Double y = Calculator.divide(1.1, 0.0);
        System.out.println(y);
        // change to int, undefined behaviour
    }
}