package hw.hw3;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Bella", "Poodle");

        dog1.setName("Rocky");
        dog1.setBreed("German Shepherd");

        dog1.display();
        dog2.display();
    }
}

