class Character {
    void attack() {
        System.out.println("Character");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage");
    }
}

public class Hw10 {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        Mage m = new Mage();

        w.attack();
        m.attack();
    }
}
