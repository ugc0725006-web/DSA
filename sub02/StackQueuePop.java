import java.util.LinkedList;
import java.util.Queue;

public class StackQueuePop {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        // O(N) time complexity - keep newest element at the front of q1
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        // O(1) time complexity
        return q1.isEmpty() ? -1 : q1.poll();
    }

    public int top() {
        // O(1) time complexity
        return q1.isEmpty() ? -1 : q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
