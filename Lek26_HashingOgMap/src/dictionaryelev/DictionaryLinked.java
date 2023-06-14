package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        if (isEmpty()) return null;

        Node current = start.next;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        Node current = start.next;
        while (current != null) {
            if (current.key.equals(key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = start.next;
        start.next = newNode;
        size++;

        return null;
    }

    @Override
    public V remove(K key) {
        if (isEmpty()) return null;

        Node current = start.next;
        while (current.next != null) {
            current = current.next;

            if (current.key.equals(key)) {
                size--;
                return current.value;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Node next;
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
        }
    }

}
