//23 april 2025
//insertion of nodes
//deletion of nodes
//what is abstract class and interface
//implimentation in child class
//4 pillars of oops
//inheritance and polymosphosim -- code reusablilty
//encapsulation and abstraction -- Data hiding
// Interface
interface Drawable {
    void draw(); // Abstract method
}

// Abstract class
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area(); // Abstract method

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete class 1
class Circle extends Shape implements Drawable {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Concrete class 2
class Rectangle extends Shape implements Drawable {
    double width, height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        Drawable d1 = (Drawable) circle;
        Drawable d2 = (Drawable) rectangle;

        d1.draw();
        circle.displayColor();
        System.out.println("Area: " + circle.area());

        d2.draw();
        rectangle.displayColor();
        System.out.println("Area: " + rectangle.area());
    }
}
