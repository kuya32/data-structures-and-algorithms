package stacksandqueues;

import java.util.EmptyStackException;

public class Stack {
    public static Node top = null;

    public static void main(String[] args) {
        Stack topper = new Stack(null);
        topper.push(1);
        topper.push(2);
        topper.push(3);
        System.out.println(topper.toString());
        topper.pop();
        topper.peek();
        System.out.println(topper.toString());
    }

    public Stack(Node top) {
        top = null;
    }

    public int push(int value) {
        Node temp = new Node(value);
        temp.next = top;
        top = temp;
        return temp.value;
    }

    public Node pop() {
        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp;
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
