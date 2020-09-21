package DataStructures.linkedList;

public class LinkedList {
    Node head = null;
    Node tail = null;

    public void insert(String value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public String toString() {
        String output = "";
        Node currentNodeIAmLookingAt = head;
        while(currentNodeIAmLookingAt != null) {
            output = output + System.out.printf("{%s} -> ", currentNodeIAmLookingAt.value);
            currentNodeIAmLookingAt = currentNodeIAmLookingAt.next;
        }
        output = output + "null";
        return output;
    }

//    public static boolean includes(String value) {
//
//    }

}
