import java.util.Scanner;

public class containsdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine(); 


        for (int i = 0; i < sentence.length(); i++) { 
            char ch = sentence.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("It is digit");
            } else{
                System.out.println("It is not digit");
            }
        }


    }
}
