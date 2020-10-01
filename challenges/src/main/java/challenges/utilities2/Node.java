package challenges.utilities2;

import challenges.utilities.Animal;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
