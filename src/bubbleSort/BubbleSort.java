package bubbleSort;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 8, 0, -2, 19};
        System.out.println("Initial Array before sorting: " + Arrays.toString(a));
        int n = a.length;
        int out, in;
        for (out = 0; out < n; out++) {// outer loop
            for (in = 0; in < n-out-1; in++) {// inner loop (forward)
                if (a[in] > a[in + 1]) {
                    // swap them
                    int temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        } // end bubbleSort()

        System.out.println("Final Array after sorting: " + Arrays.toString(a));

        System.out.println("Submitted By:\n  Mukul Mishra\n  Section-D\n  181500400");
    }
}
