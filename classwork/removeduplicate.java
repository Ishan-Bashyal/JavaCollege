import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine(); 
        String replacedSentence = "";

        for (int i = 0; i < sentence.length(); i++) { 
            char ch = sentence.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < replacedSentence.length(); j++) {
                if (ch == replacedSentence.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                replacedSentence += ch;  
            }
        }

        System.out.println("New Word Without Duplicates: " + replacedSentence);
    }
}
