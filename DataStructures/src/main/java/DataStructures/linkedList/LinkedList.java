package DataStructures.linkedList;

public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(2);
        list.addToFront(3);
        list.addToFront(4);
        System.out.println(list);
    }

    public void addToFront(int newValue) {
        Node newNode = new Node(newValue);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public String toString() {
        return toString(this.head);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

}
