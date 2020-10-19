package challenges.sorts;

import challenges.sorts.insertion.InsertionSort;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class InsertionSortTest {
    @Test
    public void testInsertionSortRandomArray() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 42};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));

    }

    @Test
    public void testInsertionReverseSort() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{20, 18, 12, 8, 5, -2};
        int[] outputArray = new int[]{-2, 5, 8, 12, 18, 20};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));
    }

    @Test
    public void testInsertionSortFewUniques() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{5, 12, 7, 5, 5, 7};
        int[] outputArray = new int[]{5, 5, 5, 7, 7, 12};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));
    }

    @Test
    public void testInsertionAlmostSorted() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{2, 3, 5, 7, 13, 11};
        int[] outputArray = new int[]{2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));
    }

    @Test
    public void testInsertionSortSingleArray() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{8};
        int[] outputArray = new int[]{8};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));
    }

    @Test
    public void testInsertionSortEmptyArray() {
        InsertionSort insertion = new InsertionSort();
        int[] inputArray = new int[]{};
        int[] outputArray = new int[]{};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, insertion.insertionSort(inputArray));
        System.out.println(Arrays.toString(insertion.insertionSort(inputArray)));
    }

}
