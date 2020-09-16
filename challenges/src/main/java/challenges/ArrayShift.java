package challenges;

import java.lang.*;

public class ArrayShift {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] insertShiftArray(int[] inputArray, int value) {
        int[] outputArray = new int[inputArray.length + 1];
        double midLength = Math.ceil(inputArray.length/2.0);

        if (inputArray.length == 0) {
            outputArray[0] = value;
        }

        for(int i = 0; i < inputArray.length; i++) {
            if (i == midLength) {
                outputArray[(int) midLength] = value;
            } else if (i > midLength) {
                outputArray[i] = inputArray[i - 1];
            } else {
                outputArray[i] = inputArray[i];
            }
            outputArray[inputArray.length] = inputArray[inputArray.length - 1];
        }
        return outputArray;
    }
}
