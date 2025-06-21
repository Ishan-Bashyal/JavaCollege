class Geometry {
    double calculateArea(double r) {
        return Math.PI * r * r;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return isTriangle ? 0.5 * base * height : 0;
    }
}

public class Hw7 {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println(g.calculateArea(5));
        System.out.println(g.calculateArea(5, 10));
        System.out.println(g.calculateArea(3, 4, true));
    }
}
