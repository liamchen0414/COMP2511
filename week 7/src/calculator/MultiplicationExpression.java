package calculator;

public class MultiplicationExpression extends BinaryExpression{
    public MultiplicationExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public double compute() {
        return getE1().compute() * getE2().compute();
    }
}
