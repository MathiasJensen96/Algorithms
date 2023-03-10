public class Task3 {
    int stack[] = new int[10];
    int MAX = 10;
    int top;

    public void push(int value) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        top++;

        stack[top] = value;
        System.out.println(value + " pushed into stack successfully!");
    }

    public void pop() {
        if (top < 0) {
            System.out.print("Stack Underflow");
        } else {
            int x = stack[top--];
            System.out.println(
                    "Element popped from stack : " + x);
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            int x = stack[top];
            return x;
        }
    }
}