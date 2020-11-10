package challenges.tree;

import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(Node root) {
        super(root);
    }

    // Website helped me construct my add method https://www.techiedelight.com/insertion-in-bst/
    public Node add(Node root, int value) {
        Node corgi = new Node(value);
        if (root == null) {
            root = corgi;
            return root;
        } else if (corgi.value < root.value) {
            root.left = add(root.left, corgi.value);
        } else {
            root.right = add(root.right, corgi.value);
        }
        return root;
    }

    public boolean contains(int value) {
        boolean hello = false;
        if (getNumbers().size() > 0) {
            for (int i = 0; i < getNumbers().size() - 1; i++) {
                if (getNumbers().contains(value)) {
                    hello = true;
                    break;
                }
            }
        }
        return hello;
    }

}
