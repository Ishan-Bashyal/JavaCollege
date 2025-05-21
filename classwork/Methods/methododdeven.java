import java.util.Scanner;

public class methododdeven {
    static void oddoreven(int n){
        if (n%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        oddoreven(n);
    }
}

