abstract class DrawableShape {
    abstract void resize();
    abstract void rotate();
}

class CircleShape extends DrawableShape {
    void resize() {
        System.out.println("Resizing Circle");
    }
    void rotate() {
        System.out.println("Rotating Circle");
    }
}

class SquareShape extends DrawableShape {
    void resize() {
        System.out.println("Resizing Square");
    }
    void rotate() {
        System.out.println("Rotating Square");
    }
}

class TriangleShape extends DrawableShape {
    void resize() {
        System.out.println("Resizing Triangle");
    }
    void rotate() {
        System.out.println("Rotating Triangle");
    }
}

public class Hw5 {
    public static void main(String[] args) {
        CircleShape c = new CircleShape();
        c.resize();
        c.rotate();

        SquareShape s = new SquareShape();
        s.resize();
        s.rotate();

        TriangleShape t = new TriangleShape();
        t.resize();
        t.rotate();
    }
}
