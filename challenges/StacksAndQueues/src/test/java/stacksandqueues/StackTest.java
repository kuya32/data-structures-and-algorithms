package stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {
    @Test public void testStackPush() {
        Stack topper = new Stack(null);
        topper.push(1);
        topper.push(2);
        assertEquals(3, topper.push(3));
        assertEquals(3, topper.top.value);
        assertEquals(4, topper.push(4));
        assertEquals(4, topper.top.value);
    }

    @Test (expected = Exception.class)
    public void testStackPopAndPeek() throws Exception {
        Stack topper = new Stack(null);
        topper.push(1);
        topper.push(2);
        topper.push(3);
        assertEquals(3, topper.pop());
        assertEquals(2, topper.peek());
        assertEquals(2, topper.pop());
        assertEquals(1, topper.peek());
        assertEquals(1, topper.pop());
        assertTrue(topper.isEmpty());
        topper.pop();
        topper.peek();
    }

    @Test public void testStackIsEmpty() {
        Stack topper = new Stack(null);
        assertTrue("true", topper.isEmpty());
        topper.push(1);
        assertFalse("false", topper.isEmpty());
    }

    @Test public void testCheckForException() {
        Stack topper = new Stack(null);
        Exception exception = assertThrows(EmptyStackException.class, topper::peek);

        String expectedMessage = "The stack is empty!";
        String actualMessage = exception.getMessage();

        assertNull(expectedMessage, actualMessage);
    }
}
