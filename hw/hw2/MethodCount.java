import java.util.Scanner;

public class MethodCount {

    public static int countWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        int count = countWords(input);
        System.out.println("Number of words: " + count);

    }
}
