package stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class QueueTest {
    @Test public void testQueueEnqueue() {
        Queue que = new Queue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        assertEquals(4, que.enqueue(4));
        assertEquals(5, que.enqueue(5));
        System.out.println(que);
    }

    @Test public void testQueueDequeueAndPeek() {
        Queue que = new Queue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        assertEquals(1, que.dequeue());
        assertEquals(2, que.peek());
        assertEquals(2, que.dequeue());
        assertEquals(3, que.peek());
        assertEquals(3, que.dequeue());
        // Still need to test for when Queue is empty for Dequeue and Peek method should raise exception
//        assertEquals("null", que.peek());
    }

    @Test public void testQueueIsEmpty() {
        Queue que = new Queue();
        assertTrue("true", que.isEmpty());
        que.enqueue(1);
        assertFalse("false", que.isEmpty());
    }

    // Ask TAs or Nicholas if I am testing for exception correctly
    @Test public void testCheckForException() {
        Queue que = new Queue();
        Exception exception = assertThrows(EmptyStackException.class, que::peek);

        String expectedMessage = "The queue is empty!";
        String actualMessage = exception.getMessage();

        assertNull(expectedMessage, actualMessage);
    }
}
