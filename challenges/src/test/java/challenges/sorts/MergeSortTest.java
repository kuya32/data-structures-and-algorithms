package challenges.sorts;

import challenges.sorts.merge.MergeSort;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSortRandomArray() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 42};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeReverseSorted() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{20, 18, 12, 8, 5, -2};
        int[] outputArray = new int[]{-2, 5, 8, 12, 18, 20};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeSortFewUniques() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 42};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeNearlySorted() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 42};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeSortSmallerOddArray() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{8, 4, 23};
        int[] outputArray = new int[]{4, 8, 23};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeSortLargerOddArray() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{100, 4, 23, 42, 16, 15, 32, 75, 8};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 32, 42, 75, 100};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeSortOneElement() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{8};
        int[] outputArray = new int[]{8};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

    @Test
    public void testMergeEmptyArray() {
        MergeSort merge = new MergeSort();
        int[] inputArray = new int[]{};
        int[] outputArray = new int[]{};
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, merge.mergeSort(inputArray));
        System.out.println(Arrays.toString(merge.mergeSort(inputArray)));
    }

}
