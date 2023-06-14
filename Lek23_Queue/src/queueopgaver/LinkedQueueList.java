package queueopgaver;

import java.util.NoSuchElementException;

public class LinkedQueueList implements QueueI {
    private Node head;
    private Node tail;
    private int size;

    public LinkedQueueList() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(Object newElement) {
        if (head == null) {
            head = new Node(newElement, null);
            tail = head;
        } else {
            tail.next = new Node(newElement, null);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Object element = head.element;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return element;
    }

    @Override
    public Object getFront() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        return head.element;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Object element;
        Node next;

        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
