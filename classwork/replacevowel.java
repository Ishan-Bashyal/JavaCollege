import java.util.Scanner;

public class replacevowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine(); 
        String vowels = "aeiouAEIOU";  
        String replacedSentence = "";

        for (int i = 0; i < sentence.length(); i++) { 
            char ch = sentence.charAt(i);
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (ch == vowels.charAt(j)) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                replacedSentence += '*';  
            } else {
                replacedSentence += ch;  
            }
        }

        System.out.println("Replaced Sentence: " + replacedSentence);
    }
}
