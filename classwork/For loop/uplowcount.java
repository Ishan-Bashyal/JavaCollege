import java.util.Scanner;

public class uplowcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine(); 

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < sentence.length(); i++) { 
            char ch = sentence.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    }
}
