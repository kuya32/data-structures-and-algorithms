package challenges.sorts.quick;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
        return arr;
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        System.out.println(pivot + " PIVOT");
        int low = left - 1;
        System.out.println(low + " LOW");
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                low++;
                System.out.println(swap(arr, i, low) + " SWAP");
            }
        }
        swap(arr, right, low + 1);
        System.out.println(Arrays.toString(arr) + " ARRAY");
        return low + 1;
    }

    public int swap(int[] arr, int i , int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        return arr[low];
    }
}
