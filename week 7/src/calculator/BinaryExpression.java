package calculator;

public abstract class BinaryExpression implements Expression{

    private Expression e1;
    private Expression e2;

    public BinaryExpression(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public Expression getE1() {
        return e1;
    }
    public void setE1(Expression e1) {
        this.e1 = e1;
    }
    public Expression getE2() {
        return e2;
    }
    public void setE2(Expression e2) {
        this.e2 = e2;
    }
}
