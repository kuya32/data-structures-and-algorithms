package DataStructures.linkedList;

public class LinkedList {
    public Node head = null;
    public Node tail = null;
    private Object Exception;

    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.append(2);
        list.append(5);
        list.insertBefore(5, 10);
        list.insertAfter(10, 55);
        list.findKthFromEnd(2);
        list.findKthFromEnd(0);
        System.out.println(list.findKthFromEnd(3));
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


    //Helped with writing the method: https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
    public void append(int newVal) {
        Node newNode = new Node(newVal);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = null;
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
        }
            last.next = newNode;
        }

    }

    // Helped with writing the method: https://stackoverflow.com/questions/6824067/manual-linked-list-insert-before-method
    public void insertBefore(int val, int newVal) {
        Node curr = this.head;

        while(curr.next != null) {
            if (curr.next.value == val) {
                Node newNode = new Node(newVal);
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    // Helped me understand to change my while loop from curr.next to just curr: https://stackoverflow.com/questions/37137350/linkedlist-insert-after-node/37138082
    public void insertAfter(int prev, int newValue) {
        Node curr = this.head;

        while (curr != null) {
            if (curr.value == prev) {
                Node newNode = new Node(newValue);
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    public int findKthFromEnd(int k) throws Exception {
        int length = 0;
        Node temp = this.head;

        while(temp != null) {
            temp = temp.next;
            length++;
        }

        if(length > k) {
            temp = this.head;
            for (int i = 1; i < length - k ; i++) {
                temp = temp.next;

            }
        } else {
            throw new Exception("Your link list is shorter than your argument value");
        }
        return temp.value;
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
