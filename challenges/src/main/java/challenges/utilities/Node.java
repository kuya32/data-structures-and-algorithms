package challenges.utilities;

public class Node {
    Animal chicken;
    Node next;

    public Node(Animal chicken) {
        this.chicken = chicken;
    }

    public Node(Animal chicken, Node next) {
        this.chicken = chicken;
        this.next = next;
    }
}
