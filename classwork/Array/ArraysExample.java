import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array1= new int[5];
        int[] array2= {1,2,3,4,5};
        int len= array1.length;
        // // array1[5]=2;
        // for (int i = 0; i < len-1; i++) {
        //     array1[i]=i;
        // }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= len-1; i++) {
            System.out.print("Enter number to keep in array: ");
            array1[i]=sc.nextInt();
        }
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));

        // for(int arr: array1){

        // }

        Arrays.fill(array1, 0);
        Arrays.sort(array1);
        int[] arrayC= Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.equals(array1, arrayC));
        
    }
    
}
