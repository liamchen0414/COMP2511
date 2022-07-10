// In Java, static variables are also called class variables.
// That is, they belong to a class and not a particular instance. 
// As a result, class initialization will initialize static variables.
public class A {
    public static void f() {
        B b1 = new B();
        B b2 = new B();
        B b3 = new B();
        b1.incX();
        b2.incY();
        System.out.println(b1.getX() + " " + b1.getY());
        System.out.println(b2.getX() + " " + b2.getY());
        System.out.println(b3.getY());
    }
    public static void main(String[] args) {
        A.f();
    }
}