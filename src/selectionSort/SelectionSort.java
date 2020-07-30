package selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 8, 0, -2, 19};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        int n = array.length;
        //Loop to 1 less than the last index i.e. n
        for (int fill = 0; fill < n - 1; fill++) {
            //posMin stores the index of element with minimum value
            int posMin = fill;
            // checks the elements of array after fill index to find minimum value among them
            for (int next = fill + 1; next < n; next++) {
                //if a value less than the posMin stored index is found store it in posMin
                if (array[next] < array[posMin]) {
                    posMin = next;
                }
            }
            //swap that minimum element from the place it was found to corresponding starting of array
            int temp = array[fill];
            array[fill] = array[posMin];
            array[posMin] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Submitted By:\n  Mukul Mishra\n  Section-D\n  181500400");
    }
}
