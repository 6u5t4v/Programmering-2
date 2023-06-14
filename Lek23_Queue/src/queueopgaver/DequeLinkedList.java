package queueopgaver;

import java.util.NoSuchElementException;

public class DequeLinkedList implements DequeI {
    private Node head;
    private Node tail;

    private int size;

    public DequeLinkedList() {
        head = new Node(null, null, null);
        tail = new Node(null, null, head);
        head.next = tail;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node(newElement, head.next, head);
        head.next = newNode;

        size++;
    }

    @Override
    public void addLast(Object newElement) {
        tail.previous = new Node(newElement, tail, tail.previous);

        size++;
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Object removedElement = head.next.element;

        if (head.next.next != null) {
            head.next = head.next.next;
        } else {
            head.next = tail;
        }

        size--;

        return removedElement;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Object removedElement = tail.previous.element;
        tail.previous = tail.previous.previous;

        size--;
        return removedElement;
    }

    @Override
    public Object getFirst() {
        return head.next.element;
    }

    @Override
    public Object getLast() {
        return tail.previous.element;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        private Object element;
        private Node next;
        private Node previous;

        public Node(Object element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
