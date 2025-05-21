package Switch;
import java.util.Scanner;

public class switche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day name: ");
        String day = sc.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("Day 1");
                break;
            case "Monday":
                System.out.println("Day 2");
                break;
            default:
                System.out.println("Not Day 1 or 2");
                break;
        }
    }
}

