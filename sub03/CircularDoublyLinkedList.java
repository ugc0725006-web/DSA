public class CircularDoublyLinkedList {
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            insertAtHead(data);
            return;
        }
        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;
        tail = newNode;
        size++;
    }

    public int removeFromHead() {
        if (head == null) {
            return -1;
        }
        int val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
        return val;
    }

    public int removeFromTail() {
        if (tail == null) {
            return -1;
        }
        int val = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
