package challenges.treeIntersection;

import challenges.tree.BinaryTree;
import challenges.tree.Node;

import java.util.HashSet;

public class TreeIntersection {
    public HashSet<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        if (tree1.getRoot() == null || tree2.getRoot() == null) {
            return set1;
        }
        addTreeNodes(tree1.getRoot(), set1);
        addTreeNodes(tree2.getRoot(), set2);
        compareNodes(tree2.getRoot(), set1, set2, set3);
        return set3;
    }

    private void addTreeNodes(Node treeNode, HashSet<Integer> set) {
        if (treeNode != null) {
            set.add(treeNode.getValue());
            addTreeNodes(treeNode.getRight(), set);
            addTreeNodes(treeNode.getLeft(), set);
        }
    }

    private void compareNodes(Node treeNode, HashSet<Integer> set1, HashSet<Integer> set2, HashSet<Integer> set3) {
        if (treeNode != null) {
            for (int one : set1) {
                for (int two : set2) {
                    if (one == two) {
                        set3.add(one);
                    }
                }
            }
        }
    }
}
