package stack;

import java.util.NoSuchElementException;

public class DONodeStack implements StackI {
    private Node top;
    private int size;

    public DONodeStack(int size) {
        top = null;
        this.size = size;
    }

    @Override
    public void push(Object element) {
        if (size() == size) {
            pop();
        }

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        Object element = top.data;

        if (top.next == null) {
            top = null;
        } else {
            Node temp = top;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            element = temp.next.data;
            temp.next = null;
        }

        return element;
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    class Node {
        public Object data;
        public Node next;
    }
}
