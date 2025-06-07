class Shape {
    int length, breadth, radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        System.out.println("Rectangle area: " + (super.length * super.breadth));
    }
}

class Squares extends Shape {
    Squares(int length) {
        super(length, length);
    }

    void calculateArea() {
        System.out.println("Square area: " + (super.length * super.breadth));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        System.out.println("Circle area: " + (3.14 * super.radius * super.radius));
    }
}

class ShapeImplemetation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.calculateArea();

        Squares square = new Squares(5);
        square.calculateArea();

        Circle circle = new Circle(4);
        circle.calculateArea();
    }
}
