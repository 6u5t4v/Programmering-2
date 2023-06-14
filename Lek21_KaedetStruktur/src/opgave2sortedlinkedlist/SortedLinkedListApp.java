package opgave2sortedlinkedlist;

public class SortedLinkedListApp {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";

        SortedLinkedList linkedList = new SortedLinkedList();

        linkedList.addElement(f);
        linkedList.addElement(e);
        linkedList.addElement(b);
        linkedList.addElement(d);
        linkedList.addElement(a);
        linkedList.addElement(c);

        linkedList.udskrivElements();

        System.out.println("Elements: " + linkedList.countElements());

        System.out.println("Remove last element");
        linkedList.removeLast();
        linkedList.udskrivElements();

        System.out.println("Remove specifc element");
        linkedList.removeElement("b");
        linkedList.udskrivElements();

        System.out.println("Add all elements from another list");
        SortedLinkedList linkedListUpper = new SortedLinkedList();
        String a2 = "a";
        String b2 = "B";
        String c2 = "C";
        String d2 = "D";
        String e2 = "E";
        String f2 = "F";
        linkedListUpper.addElement(a2);
        linkedListUpper.addElement(b2);
        linkedListUpper.addElement(c2);
        linkedListUpper.addElement(d2);
        linkedListUpper.addElement(e2);
        linkedListUpper.addElement(f2);

        linkedList.addAll(linkedListUpper);
        linkedList.udskrivElements();

        System.out.println("Count elements recursively");
        System.out.println("Elements: " + linkedList.countElementsRecursive());
    }
}
