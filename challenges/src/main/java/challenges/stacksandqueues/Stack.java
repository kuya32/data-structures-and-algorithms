package challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Stack {
    public Node top = null;

    public Stack(Node top) {
        top = null;
    }

    public int push(int value) {
        Node temp = new Node(value);
        temp.next = top;
        top = temp;
        return temp.value;
    }

    public int pop() throws Exception {
        Node temp = top;
        if (temp == null) {
            throw new Exception("Stack is Empty!");
        }
        top = top.next;
        temp.next = null;
        return temp.value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            throw new EmptyStackException();
        } else {
            System.out.println(top.value);
            return top.value;
        }
    }

    public boolean isEmpty() {
        boolean hello = true;
        if (top != null) {
            hello = false;
        }
        return hello;
    }

    public String toString() {
        return toString(top);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }


}
