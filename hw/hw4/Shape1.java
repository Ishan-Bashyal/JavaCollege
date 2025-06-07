class Shape {
}

class Rectangle extends Shape {
    private int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(9, 4);
        Circle circ = new Circle(5);

        System.out.println("Rectangle - Area: " + rect.calculateArea() + ", Perimeter: " + rect.calculatePerimeter());
        System.out.println("Circle - Area: " + circ.calculateArea() + ", Circumference: " + circ.calculateCircumference());
    }
}
