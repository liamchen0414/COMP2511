package stack.example;

public class IntPrinter<T> {
    private T num;

    public IntPrinter(T num){
        this.num = num;
    }

    public void print(){
        System.out.println(num);
    }
}
