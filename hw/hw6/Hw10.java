class Character {
    void attack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior attacks with a sword");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage attacks with a spell");
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
