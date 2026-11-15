public class UnboundedArrayStack {
    private int[] stack;
    private int size;
    private int capacity;

    public DynamicArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[this.capacity];
        this.size = 0;
    }

    public void push(int item) {
        if (size == capacity) {
            resize(2 * capacity);
        }
        stack[size++] = item;
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        int item = stack[--size];
        stack[size] = 0;

        if (size > 0 && size <= capacity / 4 && capacity > 4) {
            resize(capacity / 2);
        }
        return item;
    }

    private void resize(int newCapacity) {
        int[] newStack = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }
}