package calculator;

public class Number implements Expression{
    private int number;
    public Number(int number){
        this.number = number;
    }

    @Override
    public double compute() {
        return number;
    }
    
}
