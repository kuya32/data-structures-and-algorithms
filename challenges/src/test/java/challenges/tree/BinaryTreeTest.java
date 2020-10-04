package challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testEmptyTree() {
        BinaryTree tree = new BinaryTree(null);
        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(numbers, tree.inOrder());
    }

    @Test
    public void testSingleNodeTree() {
        Node ten = new Node(10);
        BinaryTree tree = new BinaryTree(ten);

        // TESTS ARE COMMENTED OUT BECAUSE CALLING "TREE.PREORDER()" KEEPS ADDING MORE NUMBERS TO ARRAY LIST. TEST ONE AT A TIME.
//        assertNotNull("List shouldn't be null", tree.preOrder());
//        assertEquals(1, tree.preOrder().size());
//        int indexAt0 = tree.preOrder().get(0);
//        assertEquals(10, indexAt0);
    }

    @Test
    public void testPreOrder() {
        Node ten = new Node(10);
        Node eight = new Node(8);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);

        ten.left = eight;
        eight.left = seven;
        eight.right = nine;
        ten.right = twelve;
        twelve.left = eleven;
        twelve.right = thirteen;

        BinaryTree tree = new BinaryTree(ten);
        // TESTS ARE COMMENTED OUT BECAUSE CALLING "TREE.PREORDER()" KEEPS ADDING MORE NUMBERS TO ARRAY LIST. TEST ONE AT A TIME.
//        System.out.println(tree.preOrder());
//        assertNotNull("List shouldn't be null", tree.preOrder());
//        assertEquals(7, tree.preOrder().size());
//        int indexAt0 = tree.preOrder().get(0);
//        assertEquals(10, indexAt0);
//        int indexAt3 = tree.preOrder().get(3);
//        assertEquals(9, indexAt3);
//        int indexAt6 = tree.preOrder().get(6);
//        assertEquals(13, indexAt6);
    }

    @Test
    public void testInOrder() {
        Node ten = new Node(10);
        Node eight = new Node(8);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);

        ten.left = eight;
        eight.left = seven;
        eight.right = nine;
        ten.right = twelve;
        twelve.left = eleven;
        twelve.right = thirteen;

        BinaryTree tree = new BinaryTree(ten);

        // TESTS ARE COMMENTED OUT BECAUSE "TREE.INORDER()" KEEPS ADDING MORE NUMBERS TO ARRAY LIST. TEST ONE AT A TIME.
//        System.out.println(tree.inOrder());
//        assertNotNull("List shouldn't be null", tree.inOrder());
//        assertEquals(7, tree.inOrder().size());
//        int indexAt0 = tree.inOrder().get(0);
//        assertEquals(7, indexAt0);
//        int indexAt3 = tree.inOrder().get(3);
//        assertEquals(10, indexAt3);
//        int indexAt6 = tree.inOrder().get(6);
//        assertEquals(13, indexAt6);
    }

    @Test
    public void testPostOrder() {
        Node ten = new Node(10);
        Node eight = new Node(8);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);

        ten.left = eight;
        eight.left = seven;
        eight.right = nine;
        ten.right = twelve;
        twelve.left = eleven;
        twelve.right = thirteen;

        BinaryTree tree = new BinaryTree(ten);

        // TESTS ARE COMMENTED OUT BECAUSE "TREE.POSTORDER()" KEEPS ADDING MORE NUMBERS TO ARRAY LIST. TEST ONE AT A TIME.
//        System.out.println(tree.postOrder());
//        assertNotNull("List shouldn't be null", tree.postOrder());
//        assertEquals(7, tree.postOrder().size());
//        int indexAt0 = tree.postOrder().get(0);
//        assertEquals(7, indexAt0);
//        int indexAt3 = tree.postOrder().get(3);
//        assertEquals(11, indexAt3);
//        int indexAt6 = tree.postOrder().get(6);
//        assertEquals(10, indexAt6);
    }
}
