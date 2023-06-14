package queueopgaver;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {

    private Object[] elements;
    private int currentSize;
//    private int tail;

    /**
     * Constructs an empty queue.
     */
    public ArrayQueue() {
        final int INITIAL_SIZE = 10;
        elements = new Object[INITIAL_SIZE];
        currentSize = 0;
//        tail = 0;
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param newElement the element to add
     */
    @Override
    public void enqueue(Object newElement) {
        growIfNessacary();

        elements[currentSize] = newElement;
        currentSize++;
//        tail++;
    }

    private void growIfNessacary() {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     */
    @Override
    public Object dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        Object result = elements[0];
//        System.arraycopy(elements, 1, elements, 0, currentSize - 1);
        for (int i = 0; i < currentSize - 1; i++) {
            elements[i] = elements[i + 1];
        }
        currentSize--;

        return result;
    }

    /**
     * Returns the head of this queue. The queue is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFront() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        return elements[currentSize - 1];
    }

    /**
     * The number of elements on the queue.
     *
     * @return the number of elements in the queue
     */
    @Override
    public int size() {
        return currentSize;
    }
}
