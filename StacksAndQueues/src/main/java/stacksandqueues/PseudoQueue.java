package stacksandqueues;

public class PseudoQueue {
    private Stack stacker1;
    private Stack stacker2;

    public PseudoQueue() {
        stacker1 = new Stack(null);
        stacker2 = new Stack(null);
    }

    public static void main(String[] args) {
        PseudoQueue pse = new PseudoQueue();
        pse.enqueue(1);
        pse.enqueue(2);
        pse.enqueue(3);
        System.out.println(pse);
        pse.dequeue();
        System.out.println(pse);
        pse.dequeue();
        System.out.println(pse);
    }

    public int enqueue(int value) {
        System.out.println(value + " was queued!");
        return stacker1.push(value);
    }

    public int dequeue() {
        if(stacker2.isEmpty()) {
            while(!stacker1.isEmpty()) {
                stacker2.push(stacker1.pop());
            }
        }
        int temp = 0;
        if(!stacker2.isEmpty()) {
            temp = stacker2.pop();
        }
        return temp;
    }

    public String toString() {
        return toString(stacker2.top);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }
}
