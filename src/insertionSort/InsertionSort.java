package insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 8, 0, -2, 19};
        System.out.println("Initial Array before sorting: " + Arrays.toString(array));
        int n = array.length;
        int currentPos;
        for (int nextPos = 1; nextPos < n; nextPos++) {
            int nextVal = array[nextPos];
            currentPos=nextPos;
// Element to insert.
            while (currentPos > 0 &&  array[currentPos - 1]>=nextVal) {
                array[currentPos] = array[currentPos - 1];
// Shift down.
                currentPos--;
// Check next smaller element.
            }
            // Insert nextVal at currentPos.
            array[currentPos]=nextVal;

        }
        System.out.println("Final Array after sorting: " + Arrays.toString(array));
        System.out.println("Submitted By:\n  Mukul Mishra\n  Section-D\n  181500400");


    }
}
