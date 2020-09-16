package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void testInsertShiftEvenArray() {
        ArrayShift arrayshift = new ArrayShift();
        int[] inputArray = {3, 3, 3, 3};
        int[] outputArray = {3, 3, 2, 3, 3};
        assertArrayEquals(outputArray, arrayshift.insertShiftArray(inputArray, 2));
    }

    @Test public void testInsertShiftOddArray() {
        ArrayShift arrayshift = new ArrayShift();
        int[] inputArray = {3, 3, 3};
        int[] outputArray = {3, 3, 2, 3};
        assertArrayEquals(outputArray, arrayshift.insertShiftArray(inputArray, 2));
    }

    @Test public void testInsertShiftEmptyArray() {
        ArrayShift arrayshift = new ArrayShift();
        int[] inputArray = {};
        int[] outputArray = {2};
        assertArrayEquals(outputArray, arrayshift.insertShiftArray(inputArray, 2));
    }
}
