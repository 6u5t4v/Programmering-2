package queueopgaver;

import java.util.NoSuchElementException;

public class DequeArray implements DequeI {
    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public DequeArray() {
        final int INITIAL_SIZE = 10;
        elements = new Object[INITIAL_SIZE];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        growIfNecessary();
        currentSize++;

        Object temp = elements[head];
        while (head != tail) {
            elements[head] = elements[(head + 1) % elements.length];
            head = (head + 1) % elements.length;
        }

        elements[head] = temp;
        head = (head + 1) % elements.length;
    }

    @Override
    public void addLast(Object newElement) {
        growIfNecessary();
        currentSize++;
        elements[tail] = newElement;
        tail = (tail + 1) % elements.length;
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Object removed = elements[tail];

        if (tail == 0) {
            tail = elements.length - 1;
        } else {
            tail--;
        }

        currentSize--;

        return removed;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public int size() {
        return currentSize;
    }

    private void growIfNecessary() {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }
}
