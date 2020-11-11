# Merge Sort

The Merge Sort method divides the input array into two halves. Then sorts the two arrays to be later merged and sorted to the correct positions within the array.

## Pseudocode

![Merge Sort Pseudocode](../img/mergeSort.PNG)

![Merge Sort Helper Pseudocode](../img/mergeSortHelper.PNG)

### Trace

Sample Array: ``[8, 4, 23, 42, 16, 15]``

#### Process

1. Find the middle point to divide the array into two separate arrays.

    - ![Merge Sort](../img/mergeSortOG.PNG)

2. Call mergeSort again starting on the left array until each element of array is within individual arrays unless the left array is greater than the right.
3. Repeat step 2 on the right array from the initial mergeSort.

    - ![Merge Sort 2](../img/mergeSort2.PNG)

    - ![Merge Sort 3](../img/mergeSort3.PNG)

4. Within mergeSort is a helper method called merge which handles the arranged sorting of the array from smallest to largest, left to right.
5. Finally, once the two arrays from the first initial mergeSort is sorted, the left and right array are merge one last time to get out output result

    - ![Merge Sort 3](../img/mergeSort4.PNG)


### Efficiency

- Time: O(n log(n))
- Space: O(n)
