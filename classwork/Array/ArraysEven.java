import java.util.Scanner;

public class ArraysEven {


    static void printEvenNumbers(int[][] arr) {
        System.out.println("Even numbers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " \n");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array1 = new int[4][5];

        System.out.println("Enter number in array:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        printEvenNumbers(array1);

    }
}


