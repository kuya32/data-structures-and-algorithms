package challenges.treeIntersection;


import challenges.tree.BinaryTree;
import challenges.tree.Node;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;

public class TreeIntersectionTest {

    Node tree1() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        return one;
    }

    Node tree2() {
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        seven.setLeft(eight);
        seven.setRight(nine);
        eight.setLeft(ten);
        eight.setRight(eleven);
        nine.setLeft(twelve);
        return seven;
    }

    Node tree3() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node thirtyTwo = new Node(32);
        Node twentyThree = new Node(23);
        thirtyTwo.setLeft(one);
        thirtyTwo.setRight(twentyThree);
        one.setLeft(two);
        one.setRight(three);
        twentyThree.setLeft(four);
        return thirtyTwo;
    }

    Node tree4() {
        return null;
    }

    @Test
    public void treeIntersectionTest() throws Exception {
        TreeIntersection intersect = new TreeIntersection();

        BinaryTree tree1 = new BinaryTree(tree1());
        BinaryTree tree3 = new BinaryTree(tree3());

        HashSet<Integer> output = new HashSet<>();
        output.add(1);
        output.add(2);
        output.add(3);
        output.add(4);

        assertEquals(output, intersect.treeIntersection(tree1, tree3));
    }

    @Test
    public void treeIntersectionNoCommonNumbers() throws Exception {
        TreeIntersection intersect = new TreeIntersection();

        BinaryTree tree1 = new BinaryTree(tree1());
        BinaryTree tree2 = new BinaryTree(tree2());

        HashSet<Integer> output = new HashSet<>();

        assertEquals(output, intersect.treeIntersection(tree1, tree2));
    }

    @Test
    public void treeIntersectionNoNodes() throws Exception {
        TreeIntersection intersect = new TreeIntersection();

        BinaryTree tree1 = new BinaryTree(tree4());
        BinaryTree tree2 = new BinaryTree(tree4());

        HashSet<Integer> output = new HashSet<>();

        assertEquals(output, intersect.treeIntersection(tree1, tree2));
    }

}
