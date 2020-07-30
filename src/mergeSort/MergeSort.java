package mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 8, 0, -2, 19};
        System.out.println("Initial Array before sorting: " + Arrays.toString(a));
        int leftArraySize=a.length/2;
        int rightArraySize=a.length-leftArraySize;
        int[] leftSequence=new int[leftArraySize];
        int[] rightSequence=new int[rightArraySize];
        int[] outputSequence=new int[a.length];
        System.arraycopy(a, 0, leftSequence, 0, leftArraySize);
        System.arraycopy(a, leftArraySize, rightSequence, 0, rightArraySize);
        System.out.println("Left Array: " + Arrays.toString(leftSequence));
        System.out.println("Right Array: " + Arrays.toString(rightSequence));
//merge sort starts here------->
        int i = 0; // Index into the left input sequence.
        int j = 0; // Index into the right input sequence.
        int k = 0; // Index into the output sequence.
// While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
// Find the smaller and insert it into the output sequence.
            if (leftSequence[i]<rightSequence[j]) {
                outputSequence[k++] = leftSequence[i++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
// One of the sequences has more items to copy.
// Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
// Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
        System.out.println("Final Array after sorting: " + Arrays.toString(outputSequence));
        System.out.println("Submitted By:\n  Mukul Mishra\n  Section-D\n  181500400");
    }
}
