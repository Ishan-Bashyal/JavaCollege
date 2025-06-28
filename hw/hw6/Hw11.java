abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin");
    }
}

public class Hw11 {
    public static void main(String[] args) {
        Piano p = new Piano();
        Guitar g = new Guitar();
        Violin v = new Violin();

        p.playSound();
        g.playSound();
        v.playSound();
    }
}
