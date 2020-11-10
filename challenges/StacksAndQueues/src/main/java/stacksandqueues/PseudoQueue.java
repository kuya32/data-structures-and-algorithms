package stacksandqueues;

public class PseudoQueue {
    private Stack stacker1;
    private Stack stacker2;

    public PseudoQueue() {
        stacker1 = new Stack(null);
        stacker2 = new Stack(null);
    }

    //Used the website to help construct my enqueue and dequeue methods
    public int enqueue(int value) {
        System.out.println(value + " was queued!");
        return stacker1.push(value);
    }

    public int dequeue() throws Exception {
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
