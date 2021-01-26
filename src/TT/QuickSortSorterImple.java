package TT;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] A, Comparator c) {
        quickSort(A, 0, A.length-1, c);
        System.out.println("Order by QuickSort");
    }

    static void quickSort(Object[] A, int beg, int end, Comparator c)
    {
        int loc;
        if(beg<end)
        {
            loc = partition(A, beg, end, c);
            quickSort(A, beg, loc-1, c);
            quickSort(A, loc+1, end, c);
        }
    }

    public static int partition(Object a[], int beg, int end, Comparator c)
    {

        int left, right, loc, flag;
        Object temp;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag != 1)
        {
            // while((a[loc] <= a[right])) && ...
            while(c.compare(a[loc], a[right]) <= 0 && (loc!=right))
                right -= 1;
            if(loc==right)
                flag =1;
            //else if(a[loc]>a[right])
            else if(c.compare(a[loc], a[right]) > 0)
            {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if(flag!=1)
            {
                //while((a[loc] >= a[left]) && (loc!=left))
                while(c.compare(a[loc], a[left]) >= 0 && (loc!=left))
                    left += 1;
                if(loc==left)
                    flag =1;
                //else if(a[loc] <a[left])
                else if(c.compare(a[loc], a[left]) < 0)
                {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }


}
