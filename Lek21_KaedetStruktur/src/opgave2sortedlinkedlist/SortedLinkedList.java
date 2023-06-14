package opgave2sortedlinkedlist;

public class SortedLinkedList {
    // TODO hvilke feltvariable skal klassen have
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;

        if (first == null || first.data.compareTo(e) > 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null
                    && current.next.data.compareTo(e) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        int elements = 0;
        Node temp = first;

        while (temp != null) {
            elements++;
            temp = temp.next;
        }

        return elements;
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() {
        if (first == null) {
            return false;
        }

        if (first.next == null) {
            first = null;
            return true;
        }

        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return false;
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        if (first == null) {
            return false;
        }

        if (first.data.equals(e)) {
            first = first.next;
            return true;
        }

        Node temp = first;
        while (temp.next != null) {
            if (temp.next.data.equals(e)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void addAll(SortedLinkedList list) {
        Node temp = list.first;
        while (temp != null) {
            addElement(temp.data);
            temp = temp.next;
        }
    }

    public int countElementsRecursive() {
        return countElementsRecursive(0, first);
    }

    private int countElementsRecursive(int count, Node node) {
        if (node == null) {
            return count;
        }

        return countElementsRecursive(count + 1, node.next);
    }

    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;
    }
}
