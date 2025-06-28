public class Stack {
    int[] stack = new int[100];
    int top = -1;

    void push(int element) {
        if (top == 99) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = element;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}
