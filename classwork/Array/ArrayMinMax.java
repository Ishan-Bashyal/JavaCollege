import java.util.Scanner;

public class ArrayMinMax {
    static void MinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The max value is: " + max);
        System.out.println("The min value is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }

        MinMax(array1);
    }
}
