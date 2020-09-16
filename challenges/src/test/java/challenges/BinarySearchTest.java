package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        BinarySearch binarysearch = new BinarySearch();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int output = 2;
        assertEquals(output, binarysearch.BinarySearch(inputArray, 3));
    }

    @Test public void testBinarySearchNonexistent() {
        BinarySearch binarysearch = new BinarySearch();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int output = -1;
        assertEquals(output, binarysearch.BinarySearch(inputArray, 8));
    }

    @Test public void testBinarySearchEmpty() {
        BinarySearch binarysearch = new BinarySearch();
        int[] inputArray = {};
        int output = -1;
        assertEquals(output, binarysearch.BinarySearch(inputArray, 8));
    }

    @Test public void testSequentialSearch() {
        BinarySearch sequentialsearch = new BinarySearch();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int output = 2;
        assertEquals(output, sequentialsearch.SequentialSearch(inputArray, 3));
    }

    @Test public void testSequentialSearchNonexistent() {
        BinarySearch sequentialsearch = new BinarySearch();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int output = -1;
        assertEquals(output, sequentialsearch.SequentialSearch(inputArray, 8));
    }

    @Test public void testSequentialSearchEmpty() {
        BinarySearch sequentialsearch = new BinarySearch();
        int[] inputArray = {};
        int output = -1;
        assertEquals(output, sequentialsearch.SequentialSearch(inputArray, 8));
    }
}
