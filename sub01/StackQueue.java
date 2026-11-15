import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int popped = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topVal = q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topVal;
    }
}