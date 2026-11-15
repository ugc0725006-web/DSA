import java.util.Stack;

public class QueueStackPop {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        return stack1.isEmpty() ? -1 : stack1.pop();
    }

    public int peek() {
        return stack1.isEmpty() ? -1 : stack1.peek();
    }
}