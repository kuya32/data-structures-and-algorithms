package challenges.utilities2;

import challenges.utilities.Animal;

public class Node<T> {
    T value;
    public Node<T> next;
    public Node<T> left;
    public Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next, Node<T> left, Node<T> right) {
        this.value = value;
        this.next = next;
        this.left = left;
        this.right = right;
    }
}
