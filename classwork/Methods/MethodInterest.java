import java.util.Scanner;

public class MethodInterest {

    public int interest(int principle,int time,int rate){
        return interest(principle, time, rate);
        int simple interest=principle*time*rate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int principle = sc.nextInt();
        System.out.print("Enter time: ");
        int time = sc.nextInt();
        System.out.print("Enter rate: ");
        int rate = sc.nextInt();

    }
}
