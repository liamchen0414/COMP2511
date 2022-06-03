package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color); // it runs the respective method in the super class
        System.out.println("Inside Rectangle constructor with one argument");
        this.screaming();
    }

    public Rectangle(String name, int width, int height) {
        this(name); // this runs the respective method in this class with the given parameters
        this.width = width;
        this.height = height;
        // System.out.println("Inside Rectangle constructor with three arguments");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
    }

    public void screaming(){
        System.out.println("I'm a rectangle");
    }
}
