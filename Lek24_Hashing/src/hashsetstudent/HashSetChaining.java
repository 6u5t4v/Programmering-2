package hashsetstudent;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetChaining {
    private Node[] buckets;
    private int currentSize;

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSetChaining(int bucketsLength) {
        buckets = new Node[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = hashValue(x);
        Node current = buckets[h];
        boolean found = false;
        while (!found && current != null) {
            if (current.data.equals(x)) {
                found = true;
            } else {
                current = current.next;
            }
        }
        return found;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        int h = hashValue(x);

        Node current = buckets[h];
        boolean found = false;
        while (!found && current != null) {
            if (current.data.equals(x)) {
                found = true;
                // Already in the set
            } else {
                current = current.next;
            }

        }
        if (!found) {
            Node newNode = new Node();
            newNode.data = x;
            newNode.next = buckets[h];
            buckets[h] = newNode;
            currentSize++;
        }

        double loadFactor = (double) currentSize / buckets.length;
        System.out.println("Load factor: " + loadFactor + " (" + currentSize + "/" + buckets.length + ")");
        if (loadFactor > 0.75) {
            rehash();
        }

        return !found;
    }

    private void rehash() {
        System.out.println("Rehashing");
        Node[] oldBuckets = buckets; // temporary variable
        /**
         * Create new buckets with the next prime number
         */
        int newLength = buckets.length;
        do {
            newLength++;
        } while (!isPrime(newLength));
        buckets = new Node[newLength];
        System.out.println("New length: " + newLength);
        currentSize = 0;
        for (Node oldBucket : oldBuckets) {
            Node current = oldBucket;
            while (current != null) {
                add(current.data);
                current = current.next;
            }
        }
    }

    private boolean isPrime(int newLength) {
        for (int i = 2; i < newLength; i++) {
            if (newLength % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false if x was not an
     * element of this set
     */
    public boolean remove(Object x) {
        int h = hashValue(x);

        Node current = buckets[h];
        if (current == null) {
            return false;
        }

        if (current.data.equals(x)) {
            buckets[h] = current.next;
            currentSize--;
            return true;
        }

        while (current.next != null && !current.next.data.equals(x)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            currentSize--;
            return true;
        }


        return false;
    }

    private int hashValue(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;
        return h;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    // method only for test purpose
    void writeOut() {
        for (int i = 0; i < buckets.length; i++) {
            Node temp = buckets[i];
            if (temp != null) {
                System.out.print(i + "\t");
                while (temp != null) {
                    System.out.print(temp.data + "\t");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }

    class Node {
        public Object data;
        public Node next;
    }

}
