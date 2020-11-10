package stacksandqueues;

import java.util.EmptyStackException;
import java.util.concurrent.ExecutionException;

public class Queue {
    public static Node front = null;
    public static Node rear = null;

    public Queue() {
        front = null;
        rear = null;
    }

    // Used this website for enqueue and dequeue https://www.geeksforgeeks.org/queue-linked-list-implementation/
    public int enqueue(int value) {
        Node backside = new Node(value);
        if (rear == null) {
            front = backside;
            rear = backside;
        }
        rear.next = backside;
        rear = backside;
        return backside.value;
    }

    public int dequeue() throws Exception{
        if (front == null) {
            throw new Exception("Queue is empty!");
        }

        Node backside = front;
        front = front.next;
        backside.next = null;

        if (front == null) {
            rear = null;
        }
        return backside.value;
    }

    // Used this website to work on exception https://cs.colby.edu/courses/S18/cs231/notes/outlines11.pdf
    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            throw new EmptyStackException();
        } else {
            System.out.println(front.value);
            return front.value;
        }
    }

    public boolean isEmpty() {
        boolean youThere = true;
        if (front != null) {
            youThere = false;
        }
        return youThere;
    }

    public String toString() {
        return toString(front);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }
}
