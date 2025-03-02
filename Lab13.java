import java.util.Scanner;
import java.util.Stack;

public class Lab13 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Lab13() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    public void printFront() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            System.out.println(stack2.peek());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab13 queue = new Lab13();

        String[] commands = scanner.nextLine().split(",");

        for (String command : commands) {
            String[] parts = command.split(" ");
            int queryType = Integer.parseInt(parts[0]);

            switch (queryType) {
                case 1:
                    int x = Integer.parseInt(parts[1]);
                    queue.enqueue(x);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFront();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }

        scanner.close();
    }
}
