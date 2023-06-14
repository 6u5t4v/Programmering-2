package binartreestuderende;

public class ImplementTree {
    public static void main(String[] args) {
        BinaryTree<Integer> n15 = new BinaryTree<>(15);
        BinaryTree<Integer> n25 = new BinaryTree<>(25);

        BinaryTree<Integer> n11 = new BinaryTree<>(11, null, n15);
        BinaryTree<Integer> n30 = new BinaryTree<>(30, n25, null);

        BinaryTree<Integer> n22 = new BinaryTree<>(22, n11, n30);

        BinaryTree<Integer> n88 = new BinaryTree<>(88);
        BinaryTree<Integer> n90 = new BinaryTree<>(90, n88, null);

        BinaryTree<Integer> n77 = new BinaryTree<>(77, null, n90);

        BinaryTree<Integer> n45 = new BinaryTree<>(45, n22, n77);

        System.out.println("Height: " + n15.height());
        System.out.println("Size: " + n45.size());

        // Preorder
        /**
         * 45 22 11 15 30 25 77 90 88
         */
        System.out.println("Preorder: ");
        n45.order(Order.PRE_ORDER);

        // Inorder
        /**
         * 11 15 22 25 30 45 77 88 90
         */
        System.out.println();
        System.out.println("Inorder: ");
        n45.order(Order.IN_ORDER);

        // Postorder
        /**
         * 15 11 25 30 22 88 90 77 45
         */
        System.out.println();
        System.out.println("Postorder: ");
        n45.order(Order.POST_ORDER);

        System.out.println();
        System.out.println("Sum: " + n45.sum());
    }
}
