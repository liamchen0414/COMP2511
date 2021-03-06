package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 * 
 */
public class Stack<E> implements Iterable<E> {
    private List<E> list = new ArrayList<>();
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        list.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E element = peek();
        list.remove(list.size() - 1);
        return element;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return list.get(list.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        ArrayList<E> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return list.size();
    }
    
    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> copy = new ArrayList<>(list);
        return copy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int res = 0;
        for(Integer i : stack){
            res += i;
        }
        return res;
    }

    public static void prettyPrint(Stack<?> stack) {
        // TODO:
    }
        

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }

}