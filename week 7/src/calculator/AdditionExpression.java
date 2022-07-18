package calculator;

public class AdditionExpression extends BinaryExpression{
    public AdditionExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double compute() {
        return getE1().compute() + getE2().compute();
    }
}