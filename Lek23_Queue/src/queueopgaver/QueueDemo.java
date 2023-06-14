package queueopgaver;

public class QueueDemo {
    public static void main(String[] args) {
//        QueueI q = new LinkedQueueList();
//        q.enqueue("Tom");
//        q.enqueue("Diana");
//        q.enqueue("Harry");
//        q.enqueue("Thomas");
//        q.enqueue("Bob");
//        q.enqueue("Brian");
//        System.out.println(q.getFront());
//        System.out.println(q.isEmpty() + " " + q.size());
//        while (!q.isEmpty()) {
//            System.out.println(q.dequeue());
//        }
//        System.out.println();
//        System.out.println(q.isEmpty() + " " + q.size());
//        System.out.println();
//        q.enqueue("Anna");
//        q.enqueue("Lotte");
//        System.out.println(q.isEmpty() + " " + q.size());
//        while (!q.isEmpty()) {
//            System.out.println(q.dequeue());
//        }
//        System.out.println();
//        System.out.println(q.isEmpty() + " " + q.size());
        testDeque();
    }

    private static void testDeque() {
        DequeI d = new DequeLinkedList();
        d.addFirst("Tom");
        d.addFirst("Diana");
        d.addFirst("Harry");
        d.addFirst("Thomas");
        System.out.println(d.getFirst());
        System.out.println(d.isEmpty() + " " + d.size());
        while (!d.isEmpty()) {
            System.out.println(d.removeFirst());
        }

    }
}
