import java.util.Scanner;

public class MethodASCII {

    public static int getASCIIValue(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);  

        int asciiValue = getASCIIValue(character);
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

    }
}
