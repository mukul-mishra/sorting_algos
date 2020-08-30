package qs;

public class ArrayIns {
    private long[] theArray;
    private int nElems;
    public ArrayIns(int max)
    {
        theArray = new long[max];
        nElems = 0;
    }
    public void insert(long value)
    {
        theArray[nElems] = value;
        nElems++;
    }
    public void display()
    {

        for(int j=0; j<nElems; j++)
            System.out.print(theArray[j] + " ");
        System.out.println(" ");
    }

    public void quickSort()
    {
        recQuickSort(0, nElems-1);
    }
    public void recQuickSort(int left, int right)
    {
        if(right-left <= 0) // if size <= 1,
            return; // already sorted
        else // size is 2 or larger
        {
            long pivot = theArray[right];

            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }
    public int partitionIt(int left, int right, long pivot)
    {
        int leftPtr = left-1;
        int rightPtr = right;
        while(true)
        {
            while( theArray[++leftPtr] < pivot );
            while(rightPtr > 0 && theArray[--rightPtr] > pivot);

            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int dex1, int dex2)
    {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
class QuickSort
{
    public static void main(String[] args)
    {
        int maxSize = 16;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);
        for(int j=0; j<maxSize; j++)
        {
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        System.out.print("Unsorted Array= ");
        arr.display(); // display items
        arr.quickSort(); // quicksort them
        System.out.print("Sorted Array= ");
        arr.display();// display them again
        System.out.println("Submitted By:\n  Mukul Mishra\n  Section-D\n  181500400");
    } // end main()
}
