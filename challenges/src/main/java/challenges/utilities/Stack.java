package challenges.utilities;

import java.util.EmptyStackException;

public class Stack<T> {
    public Node top;

    public Node push (Animal chicken) {
        if(top == null) {
            this.top = new Node(chicken);
        } else {
            this.top = new Node(chicken, this.top);
        }
        return top;
    }

    public Node push2 (Animal chicken) {
        if(top == null) {
            this.top = new Node(chicken);
        } else {
            this.top = new Node(chicken, this.top);
        }
        return top;
    }

    public Animal pop() {
        if(this.top == null) {
            throw new EmptyStackException();
        } else {
            Animal chicken = top.chicken;
            top = top.next;
            return chicken;
        }
    }

    public Animal peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            throw new EmptyStackException();
        } else {
            System.out.println(top.chicken);
            return top.chicken;
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
        return toString(this.top);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%s} -> %s", current.chicken, toString(current.next));
    }

}
