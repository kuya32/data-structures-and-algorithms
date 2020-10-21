package challenges.sorts.merge;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }
            System.out.println(Arrays.toString(left));
            int[] right = new int[n - mid];
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[mid];
                mid = mid + 1;
            }
            System.out.println(Arrays.toString(right));
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }

    public int[] merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == left.length) {
            arr[k] = right[j];
            i = i + 1;
        } else {
            arr[k] = left[i];
            j = j + 1;
        }
        k = k + 1;
        return arr;
    }

}
