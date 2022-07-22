package stack.example;

import java.io.Serializable;

public class PrinterForNumber<T extends Number & Serializable> {
    private T num;

    public PrinterForNumber(T num){
        this.num = num;
    }

    public void print(){
        System.out.println(num);
    }
}
