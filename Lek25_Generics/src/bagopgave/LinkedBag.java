package bagopgave;

public class LinkedBag<T> implements Bag<T> {
    private Node<T> head;
    private int currentSize;

    public LinkedBag() {
        this.currentSize = 0;
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isEmpty()) {
            head = new Node<>(newEntry, null);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(newEntry, null);
        }

        currentSize++;
        return true;
    }

    @Override
    public T remove() {
        if (isEmpty()) return null;

        if (currentSize == 1) {
            T resultat = head.data;
            head = null;
            currentSize--;
            return resultat;
        }

        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        T resultat = current.next.data;
        current.next = null;
        currentSize--;

        return resultat;
    }

    @Override
    public boolean remove(T anEntry) {
        if (isEmpty()) return false;

        if (head.data.equals(anEntry)) {
            head = head.next;
            currentSize--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(anEntry)) {
                current.next = current.next.next;
                currentSize--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public void clear() {
        head = null;
        currentSize = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(anEntry)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(anEntry)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public T[] toArray() {
        T[] resultat = (T[]) new Object[currentSize];
        Node<T> current = head;
        for (int i = 0; i < currentSize; i++) {
            resultat[i] = current.data;
            current = current.next;
        }
        return resultat;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
