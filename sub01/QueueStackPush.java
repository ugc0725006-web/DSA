import java.util.Stack;

public class QueueStackPush {
    private Stack<Integer> sIn = new Stack<>();
    private Stack<Integer> sOut = new Stack<>();

    public void enqueue(int x) {
        sIn.push(x);
    }

    public int dequeue() {
        if (sOut.isEmpty()) {
            while (!sIn.isEmpty()) {
                sOut.push(sIn.pop());
            }
        }
        return sOut.isEmpty() ? -1 : sOut.pop();
    }

    public int peek() {
        if (sOut.isEmpty()) {
            while (!sIn.isEmpty()) {
                sOut.push(sIn.pop());
            }
        }
        return sOut.isEmpty() ? -1 : sOut.peek();
    }
}