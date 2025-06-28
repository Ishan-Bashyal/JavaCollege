import java.util.Scanner;

public class SupermarketQueue {
    static String[] queue = new String[100];
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Show Queue");
            System.out.println("4. Count");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                queue[rear++] = name;
                System.out.println(name + " added.");
            } else if (choice == 2) {
                if (front == rear) {
                    System.out.println("Queue empty");
                } else {
                    System.out.println("Serving " + queue[front++]);
                }
            } else if (choice == 3) {
                System.out.println("Current Queue:");
                for (int i = front; i < rear; i++) {
                    System.out.println(queue[i]);
                }
            } else if (choice == 4) {
                System.out.println("Total: " + (rear - front));
            } else if (choice == 5) {
                break;
            }
        }
    }
}
