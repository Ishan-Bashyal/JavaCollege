import java.util.Scanner;

public class ArrayAverageValue {

    static void AverageValue(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            {
                sum += arr[i];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average value of numbers is: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];


        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
                array1[i] = sc.nextInt();
            }
        AverageValue(array1);
    }

}
    

    

