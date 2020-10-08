package challenges.utilities2;

import java.util.EmptyStackException;

public class Stack<T> {
    public Node<T> top;

    public Node<T> push (T value) {
        if(top == null) {
            this.top = new Node<T>(value);
        } else {
            this.top = new Node<T>(value, this.top, top.left, top.right);
        }
        return top;
    }

    public T pop() {
        if(this.top == null) {
            throw new EmptyStackException();
        } else {
            T value = top.value;
            top = top.next;
            return value;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            throw new EmptyStackException();
        } else {
//            System.out.println(top.value);
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

}
