package challenges.sorts;

import challenges.sorts.quick.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSortRandomArray() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] outputArray = new int[]{4, 8, 15, 16, 23, 42};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortReverseArray() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{20, 18, 12, 8, 5, -2};
        int[] outputArray = new int[]{-2, 5, 8, 12, 18, 20};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortFewUniques() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{5, 12, 7, 5, 5, 7};
        int[] outputArray = new int[]{5, 5, 5, 7, 7, 12};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortNearlySorted() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{2, 3, 5, 7, 13, 11};
        int[] outputArray = new int[]{2, 3, 5, 7, 11, 13};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortLargeOddArray() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{8, 4, 23, 42, 16, 15, 32, -10, -19};
        int[] outputArray = new int[]{-19, -10, 4, 8, 15, 16, 23, 32, 42};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortEmptyArray() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{};
        int[] outputArray = new int[]{};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }

    @Test
    public void testQuickSortOneArray() {
        QuickSort quick = new QuickSort();
        int[] inputArray = new int[]{8};
        int[] outputArray = new int[]{8};
        int n = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        assertArrayEquals(outputArray, quick.quickSort(inputArray, 0, n - 1));
        System.out.println(Arrays.toString(quick.quickSort(inputArray, 0, n - 1)));
    }
}
