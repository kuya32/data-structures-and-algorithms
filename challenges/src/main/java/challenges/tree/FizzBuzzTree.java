package challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FizzBuzzTree {
    public ArrayList<String> words = new ArrayList<>();
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node eight = new Node(8);
        Node seven = new Node(7);
        Node nine = new Node(9);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(15);

        ten.left = eight;
        eight.left = seven;
        eight.right = nine;
        ten.right = twelve;
        twelve.left = eleven;
        twelve.right = thirteen;
        BinaryTree tree = new BinaryTree(ten);
        FizzBuzzTree tree1 = new FizzBuzzTree();
        tree1.FizzBuzzTreeMethod(tree);

    }

    public BinaryTree FizzBuzzTreeMethod (BinaryTree tree) {
        Node current = tree.root;
        Queue<Node> que = new LinkedList<>();
        que.add(current);
        while (!que.isEmpty()) {
            current = (Node) que.peek();
            que.remove();
            if (current.value % 3 == 0 && current.value % 5 == 0) {
                words.add("FizzBuzz");
                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            } else if (current.value % 3 == 0) {
                words.add("Fizz");
                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            } else if (current.value % 5 == 0) {
                words.add("Buzz");
                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            } else {
                words.add(Integer.toString(current.value));
                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            }
            System.out.println(words);
        }

        BinaryTree tree2 = insertLevelOrder(words, current);
        return tree;
    }

    public BinaryTree insertLevelOrder (ArrayList<String> arr) {
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeString(arr.get(0))
    }


}
