package stack.example;

import java.util.Iterator;

public class IntPrinter<T>  implements Iterable{
    private T num;

    public IntPrinter(T num){
        this.num = num;
    }

    public void print(){
        System.out.println(num);
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
