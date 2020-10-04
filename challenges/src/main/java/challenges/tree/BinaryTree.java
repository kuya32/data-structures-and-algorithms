package challenges.tree;


import java.util.ArrayList;

public class BinaryTree {
    public Node root = null;
    public ArrayList<Integer> numbers = new ArrayList<>();

    public BinaryTree(Node root) {
        this.root = root;
    }

    public ArrayList<Integer> preOrder() {
        if (root == null) {
            return numbers;
        }
        _preOrderTraversal(root);
        return numbers;
    }

    public void _preOrderTraversal(Node alvin) {
        numbers.add(alvin.value);
        if (alvin.left != null) {
            _preOrderTraversal(alvin.left);
        }
        if (alvin.right != null) {
            _preOrderTraversal(alvin.right);
        }
    }

    public ArrayList<Integer> inOrder() {
        if (root == null) {
            return numbers;
        }
        _inOrderTraversal(root);
        return numbers;
    }

    public void _inOrderTraversal(Node simon) {
        if (simon.left != null) {
            _inOrderTraversal(simon.left);
        }
        numbers.add(simon.value);
        if (simon.right != null) {
            _inOrderTraversal(simon.right);
        }
    }

    public ArrayList<Integer> postOrder() {
        if (root == null) {
            return numbers;
        }
        _postOrderTraversal(root);
        return numbers;
    }

    public void _postOrderTraversal(Node theo) {
        if (theo.left != null) {
            _postOrderTraversal(theo.left);
        }
        if (theo.right != null) {
            _postOrderTraversal(theo.right);
        }
        numbers.add(theo.value);
    }

}
