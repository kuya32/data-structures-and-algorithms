package challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root = null;
    public ArrayList<Integer> numbers = new ArrayList<>();

    public BinaryTree() {
        this.root = root;
    };

    public BinaryTree(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
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
        System.out.println(tree.findMaximumValue(tree.root));
        System.out.println(tree.breadthFirstTraversal(tree));
    }

    public ArrayList<Integer> preOrder() {
        if (root == null) {
            return numbers;
        }
        preOrderTraversal(root);
        return numbers;
    }

    public void preOrderTraversal(Node alvin) {
        numbers.add(alvin.value);
        if (alvin.left != null) {
            preOrderTraversal(alvin.left);
        }
        if (alvin.right != null) {
            preOrderTraversal(alvin.right);
        }
    }

    public ArrayList<Integer> inOrder() {
        if (root == null) {
            return numbers;
        }
        inOrderTraversal(root);
        return numbers;
    }

    public void inOrderTraversal(Node simon) {
        if (simon.left != null) {
            inOrderTraversal(simon.left);
        }
        numbers.add(simon.value);
        if (simon.right != null) {
            inOrderTraversal(simon.right);
        }
    }

    public ArrayList<Integer> postOrder() {
        if (root == null) {
            return numbers;
        }
        postOrderTraversal(root);
        return numbers;
    }

    public void postOrderTraversal(Node theo) {
        if (theo.left != null) {
            postOrderTraversal(theo.left);
        }
        if (theo.right != null) {
            postOrderTraversal(theo.right);
        }
        numbers.add(theo.value);
    }

    // This website helped me construct my method https://stackoverflow.com/questions/23173932/how-to-find-max-value-in-a-binary-tree
    public int findMaximumValue(Node root) {
        int max = Integer.MIN_VALUE;
        if (root == null) {
            return max;
        } else {
            int leftMax = findMaximumValue(root.left);
            int rightMax = findMaximumValue(root.right);
            if (leftMax > rightMax) {
                max = leftMax;
            } else {
                max = rightMax;
            }
            if (root.value > max) {
                max = root.value;
            }
        }
        return max;
    }

    //Assistance from David Dickens
    public ArrayList<Integer> breadthFirstTraversal(BinaryTree tree) {
        Node current = tree.root;
        Queue<Node> que = new LinkedList<>();
        que.add(current);
        while (!que.isEmpty()) {

            current = (Node) que.peek();
            que.remove();
            numbers.add(current.value);
            if (current.left != null) {
                que.add(current.left);
            }
            if (current.right != null) {
                que.add(current.right);
            }

        }
        return numbers;
    }
}
