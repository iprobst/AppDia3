package TT;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public void sort(Object[] arr, Comparator c) {
        bubbleSort(arr, arr.length, c);
    }

    private void bubbleSort(Object arr[], int n, Comparator c)
    {
        int i, j;
        Object temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                //if (arr[j] > arr[j + 1])
                if (c.compare(arr[j], arr[j+1]) > 0)
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }

        System.out.println("Order by BubbleSort");
    }
}
