package challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testAppendAndToString() {
        LinkedList test = new LinkedList();
        assertNotNull(test);
        test.append(2);
        test.append(3);
        test.append(1);
        assertEquals("{2} -> {3} -> {1} -> null", test.toString());
        assertEquals(2, test.head.value);
        assertEquals(3, test.head.next.value);
    }

    @Test
    public void testInsertBeforeAndToString() {
        LinkedList test = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.insertBefore(2, 6);
        test.insertBefore(6, 3);
        System.out.println(test.toString());
        assertEquals("{2} -> {6} -> {3} -> {1} -> null", test.toString());
        assertEquals(2, test.head.value);
        assertEquals(6, test.head.next.value);
        assertEquals(3, test.head.next.next.value);
    }

    @Test
    public void testInsertAfterAndToString() {
        LinkedList test = new LinkedList();
        test.insert(1);
        test.insert(2);
        test.insertAfter(1, 6);
        test.insertAfter(6, 32);
        System.out.println(test.toString());
        assertEquals("{2} -> {32} -> {6} -> {1} -> null", test.toString());
        assertEquals(2, test.head.value);
        assertEquals(32, test.head.next.value);
        assertEquals(6, test.head.next.next.value);
    }

    @Test
    public void testInsertAndToString() {
        LinkedList test = new LinkedList();
        assertNotNull(test);
        test.insert(2);
        test.insert(3);
        test.insert(1);
        assertEquals("{1} -> {3} -> {2} -> null", test.toString());
        assertEquals(1, test.head.value);
        assertEquals(3, test.head.next.value);
    }

    @Test public void testIncludes() {
        LinkedList test = new LinkedList();
        test.insert(2);
        test.insert(3);
        test.insert(1);
        assertTrue(test.includes(2));
        assertFalse(test.includes(32));
    }

    @Test
    public void testFindKthFromEnd() throws Exception {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        list2.insert(32);
        list.insert(2);
        list.insert(5);
        list.insertBefore(5, 10);
        list.insertAfter(10, 55);
        System.out.println(list);
        System.out.println(list2);
        assertEquals(55, list.findKthFromEnd(2));
        assertEquals(5, list.findKthFromEnd(3));
        assertEquals(10, list.findKthFromEnd(1));
        assertEquals(32, list2.findKthFromEnd(0));
    }

    @Test (expected = Exception.class)
    public void testFindKthFromEndException() throws Exception {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(5);
        list.insertBefore(5, 10);
        list.insertAfter(10, 55);
        list.findKthFromEnd(32);
        list.findKthFromEnd(-2);
    }

    @Test public void testZipLists() {
        LinkedList testOne = new LinkedList();
        LinkedList testTwo = new LinkedList();
        testOne.insert(2);
        testOne.insert(3);
        testOne.insert(1);
        testTwo.insert(4);
        testTwo.insert(9);
        testTwo.insert(5);
        System.out.println(testOne);
        System.out.println(testTwo);
        LinkedList output = LinkedList.zipLists(testOne, testTwo);
        String outputToString = "{1} -> {5} -> {3} -> {9} -> {2} -> {4} -> null";
        System.out.println(output.toString());
        assertEquals(outputToString, output.toString());
    }

    @Test public void testZipListsOneEmptyLinkedList() {
        LinkedList testOne = new LinkedList();
        LinkedList testTwo = new LinkedList();
        testOne.insert(2);
        testOne.insert(3);
        testOne.insert(1);
        System.out.println(testOne);
        LinkedList output = LinkedList.zipLists(testOne, testTwo);
        String outputToString = "{1} -> {3} -> {2} -> null";
        System.out.println(output.toString());
        assertEquals(outputToString, output.toString());
    }

    @Test (expected = Exception.class)
    public void testZipListsEmptyLinkedLists() {
        LinkedList testOne = new LinkedList();
        LinkedList testTwo = new LinkedList();
        LinkedList.zipLists(testOne, testTwo);
    }

}
