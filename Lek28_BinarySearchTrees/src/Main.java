import binarysearchtreestuderende.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(45);
        binarySearchTree.add(22);
        binarySearchTree.add(15);
        binarySearchTree.add(30);
        binarySearchTree.add(25);
        binarySearchTree.add(77);
        binarySearchTree.add(90);
        binarySearchTree.add(88);

        System.out.println("Max and min");
        System.out.println("Find Max: " + binarySearchTree.findMax());
        System.out.println("Find Min: " + binarySearchTree.findMin());

        System.out.println("Removing max and min");
        System.out.println("Remove max: " + binarySearchTree.removeMax());
        System.out.println("Remove min: " + binarySearchTree.removeMin());

        System.out.println("New max and min");
        System.out.println("Find Max: " + binarySearchTree.findMax());
        System.out.println("Find Min: " + binarySearchTree.findMin());
    }
}