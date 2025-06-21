abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() {
        System.out.println("Preparing Appetizer");
    }
    void serve() {
        System.out.println("Serving Appetizer");
    }
}

class MainCourse extends MenuItem {
    void prepare() {
        System.out.println("Preparing Main Course");
    }
    void serve() {
        System.out.println("Serving Main Course");
    }
}

class Beverage extends MenuItem {
    void prepare() {
        System.out.println("Pouring Beverage");
    }
    void serve() {
        System.out.println("Serving Beverage");
    }
}

public class Hw4 {
    public static void main(String[] args) {
        Appetizer a = new Appetizer();
        a.prepare();
        a.serve();

        MainCourse m = new MainCourse();
        m.prepare();
        m.serve();

        Beverage b = new Beverage();
        b.prepare();
        b.serve();
    }
}
