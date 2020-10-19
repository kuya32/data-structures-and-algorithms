package challenges.sorts.insertion;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
