import java.util.Scanner;

public class CallCenterQueue {
    static String[] queue = new String[100];
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Call");
            System.out.println("2. Handle Call");
            System.out.println("3. Show Queue");
            System.out.println("4. Pending Calls");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter caller name: ");
                String name = sc.nextLine();
                queue[rear++] = name;
                System.out.println(name + " added to call queue.");
            } else if (choice == 2) {
                if (front == rear) {
                    System.out.println("No calls to handle.");
                } else {
                    System.out.println("Handling call from " + queue[front++]);
                }
            } else if (choice == 3) {
                System.out.println("Call Queue:");
                for (int i = front; i < rear; i++) {
                    System.out.println(queue[i]);
                }
            } else if (choice == 4) {
                System.out.println("Pending Calls: " + (rear - front));
            } else if (choice == 5) {
                break;
            }
        }
    }
}
