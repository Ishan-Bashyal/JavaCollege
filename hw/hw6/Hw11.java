abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano plays a melody");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar strums chords");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin plays a beautiful tune");
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
