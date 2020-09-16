package challenges;

public class BinarySearch {
    public int BinarySearch(int[] sortedArray, int key) {
        int first = 0;
        int last = sortedArray.length - 1;
        int mid = (first + last)/2;

        while( first <= last ){
            if (sortedArray[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                return mid;
            }else if ( sortedArray[mid] < key ){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }

    public int SequentialSearch(int[] sortedArray, int key) {
        for(int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
