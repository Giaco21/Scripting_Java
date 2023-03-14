import java.util.ArrayList;

// Definizione della classe astratta Shape
abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Definizione della classe Circle che estende la classe Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

// Definizione della classe Rectangle che estende la classe Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Esempio di utilizzo del programma
public class ShapesTest {
    public static void main(String[] args) {
        // Creazione di una lista di forme geometriche
        ArrayList<Shape> shapes = new ArrayList<>();

        // Aggiunta di un cerchio alla lista
        Circle circle = new Circle(5);
        shapes.add(circle);

        // Aggiunta di un rettangolo alla lista
        Rectangle rectangle = new Rectangle(3, 4);
        shapes.add(rectangle);

        // Calcolo dell'area e del perimetro di tutte le forme geometriche nella lista
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
