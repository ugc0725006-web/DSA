public class LinkedListFIFOQueue {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return val;
    }

    public int peek() {
        return isEmpty() ? -1 : front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}