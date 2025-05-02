import java.util.Scanner;

public class MethodCube {

    public static int findCube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int cube = findCube(number);
        System.out.println("Cube of " + number + " is: " + cube);

    }
}

