package DataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testInsertAndToString() {
        LinkedList test = new LinkedList();
        assertNotNull(test);
        test.insert(2);
        test.insert(3);
        test.insert(1);
        assertEquals("{1} -> {3} -> {2} -> null", test.toString());
        assertEquals(1, test.head.value);
    }

    @Test public void testIncludes() {
        LinkedList test = new LinkedList();
        test.insert(2);
        test.insert(3);
        test.insert(1);
        assertTrue(test.includes(2));
        assertFalse(test.includes(32));
    }
    
//
//
////    @Test public void testFindKthFromEnd() {
////        LinkedList list = new LinkedList();
////        list.append(2);
////        list.append(5);
////        list.insertBefore(5, 10);
////        list.insertAfter(10, 55);
////        System.out.println(list);
////    }
//
//    @Test public void testZipLists() {
//        LinkedList testOne = new LinkedList();
//        LinkedList testTwo = new LinkedList();
//        testOne.append(2);
//        testOne.append(3);
//        testOne.append(1);
//        testTwo.append(4);
//        testTwo.append(9);
//        testTwo.append(5);
//        System.out.println(testOne);
//        System.out.println(testTwo);
//        LinkedList output = LinkedList.zipLists(testOne, testTwo);
//        assertEquals(output.head.value, 4);
//        assertEquals(output.head.next.value, 2);
//        assertEquals(output.head.next.next.value, 9);
//    }
}
