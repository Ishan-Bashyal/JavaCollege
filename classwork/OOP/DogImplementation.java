
import java.util.Scanner;

public class DogImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog doggy = new Dog();

        System.out.print("Enter dog's name: ");
        doggy.name = sc.nextLine();

        System.out.print("Enter dog's age: ");
        doggy.age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter dog's color: ");
        doggy.color = sc.nextLine();


        doggy.printDetails();
        doggy.wag();
        doggy.getAge();
        doggy.getName();
        doggy.getColor();

    }
}
