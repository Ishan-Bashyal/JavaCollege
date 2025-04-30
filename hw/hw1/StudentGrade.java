import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}

