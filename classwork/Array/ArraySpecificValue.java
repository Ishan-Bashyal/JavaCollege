import java.util.Scanner;

public class ArraySpecificValue {

    static void SpecificValue(int[] arr) {
        int spec = 1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (spec == arr[i]) {
                System.out.println("Specific value " + spec + " found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Specific value " + spec + " not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];

        System.out.println("Enter 5 numbers for the array:");

        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }

        SpecificValue(array1);
    }
}

