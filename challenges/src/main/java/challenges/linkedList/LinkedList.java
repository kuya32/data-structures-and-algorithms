package challenges.linkedList;

public class LinkedList {
    public Node head = null;
    public Node tail = null;
    public Node next = null;

    // This method adds a new node to the front of the linked list
    public void insert(int newValue) {
        Node newNode = new Node(newValue);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    //This method checks to see if a certain value is within the linked list
    public boolean includes(int value) {
        boolean hello = false;
        while (head != null) {
            if (head.value == value) {
                hello = true;
                break;
            } else {
                head = head.next;
            }
        }
        return hello;
    }

    //Helped with writing the method: https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
    // This method appends the node to the end of the linked list
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
    // The insertBefore method adds a new node before a given node value in the linked list
    public void insertAfter(int val, int newVal) {
        Node curr = this.head;
        Node newNode = new Node(newVal);

        if (curr == null) {
            System.out.println("insertAfter() does not work");
            return;
        }

        while(curr.next != null) {
            if (curr.next.value == val) {
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    // Helped me understand to change my while loop from curr.next to just curr: https://stackoverflow.com/questions/37137350/linkedlist-insert-after-node/37138082
    // The insertAfter method adds a new node after a given node value in the linked list
    public void insertBefore  (int val, int newValue) {
        Node curr = this.head;
        Node newNode = new Node(newValue);

        if (curr == null) {
            System.out.println("insertAfter() does not work");
            return;
        }

        while (curr != null) {
            if (curr.value == val) {
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    // Used the website to construct method https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
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

    // Used the website for help https://www.techiedelight.com/merge-alternate-nodes-two-linked-lists/
    public static LinkedList zipLists(LinkedList one, LinkedList two) {
        if(one == null) {
            return two;
        } else if (two == null) {
            return one;
        }

        Node head1 = one.head;
        Node head2 = two.head;
        Node temp = head1.next;
        Node temp2 = head2.next;
        LinkedList shadowClone = new LinkedList();
        shadowClone.append(head1.value);
        shadowClone.append(head2.value);

        while(temp != null && temp2 != null) {
            shadowClone.append(temp.value);
            temp = temp.next;
            shadowClone.append(temp2.value);
            temp2 = temp2.next;
        }
        return shadowClone;
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

