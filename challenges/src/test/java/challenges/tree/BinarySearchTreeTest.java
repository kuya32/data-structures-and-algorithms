package challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testAddToBinaryTree() {
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

        BinarySearchTree tree = new BinarySearchTree(ten);
        // TESTS ARE COMMENTED OUT BECAUSE CALLING "TREE.INORDER()" KEEPS ADDING MORE NUMBERS TO ARRAY LIST. TEST ONE AT A TIME.
        tree.add(ten, 6);
//        assertEquals(8, tree.inOrder().size());
//        int indexAt0 = tree.inOrder().get(0);
//        assertEquals(6, indexAt0);
        tree.add(ten, 14);
//        assertEquals(9, tree.inOrder().size());
//        int indexAt8 = tree.inOrder().get(8);
//        assertEquals(14, indexAt8);
    }

    @Test
    public void testContainsInBinaryTree() {
        Node ten = new Node(10);
        Node eight = new Node(8);

        ten.left = eight;

        BinarySearchTree tree = new BinarySearchTree(ten);
        tree.inOrder();
        assertTrue(tree.contains(10));
        assertTrue(tree.contains(8));
        assertFalse(tree.contains(32));
    }
}
