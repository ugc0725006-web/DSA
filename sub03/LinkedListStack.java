public class LinkedListStack {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int peek() {
        return isEmpty() ? -1 : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}