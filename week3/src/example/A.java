package example;

public class A {
    public static void f() {
        C c = new C();
        c.speak();
        B b = c;
        // we just make c a type B, but it is still C
        // if you print this, the class is actually C
        // System.out.println(b.getClass()); 
        b.speak();
        b = new B();
        b.speak();
        c.speak();
    }

    public static void main(String[] args) {
        A.f();
        // quack
        // quack
        // moo
        // quack
    }
}
