package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
    @Test
    public void testPseudoQueueEnqueue() {
        PseudoQueue pse = new PseudoQueue();
        pse.enqueue(1);
        pse.enqueue(2);
        pse.enqueue(3);
        assertEquals(4, pse.enqueue(4));
        assertEquals(5, pse.enqueue(5));
    }

    @Test
    public void testPseudoQueueDequeue() throws Exception {
        PseudoQueue pse = new PseudoQueue();
        pse.enqueue(1);
        pse.enqueue(2);
        pse.enqueue(3);
        assertEquals(1, pse.dequeue());
        assertEquals(2, pse.dequeue());
        assertEquals(3, pse.dequeue());
    }

    
}
