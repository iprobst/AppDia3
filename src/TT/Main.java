package TT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Comparator<Integer> c = (a, b) -> a-b;
        Comparator<String> sC = (a, b) -> a.compareTo(b);

        Sorter sorter = new QuickSortSorterImple();
        Integer [] arr = {3, 54, 5, 34, 6, 123, 1};
        sorter.sort(arr, c);
        printArray(arr);

        sorter = new HeapSortSorterImple();
        Integer [] arr2 = {44, 3, 57, 54, 5, 34, 6, 123, 1};
        sorter.sort(arr2, c);
        printArray(arr2);

        sorter = new BubbleSortSorterImple();
        Integer [] arr3 = {3, 54, 2, 55, 6, 123, 1, 1045, 23};
        sorter.sort(arr3, c);
        printArray(arr3);

        Properties properties= new Properties();

        try {
            properties.load(new FileInputStream(new File("MiFactory.properties")));
            sorter = (Sorter) MiFactory.getInstance((String) properties.get("sorter"));
            Integer [] arr4 = {13, 4, 22, 5, 65, 14, 1, 145, 23};
            sorter.sort(arr4, c);
            printArray(arr4);
            String [] sArr1 = {"Ignacio", "Pedro", "Juan", "Alejandro","Simon", "Pepe" };
            sorter.sort(sArr1, sC);
            printArray(sArr1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        Integer arrInteger[] = new Integer[100000];
        int indice = 0;
        for (int i = 100000; i > 0; i--) {
            arrInteger[indice] = i;
            indice += 1;
        }



        Time.start();
        sorter.sort(arrInteger, c);
        Time.end();
        System.out.println("Array["+ arrInteger.length + "]" + " ordenado en: " + Time.elapsedTime() + "ms");;

        /*
            HeapSort   prom 4   milisegundos
            QuickSort  prom 109 milisegundos
            BubbleSort prom 308 milisegundos
         */

        System.out.println();




    }

    /* A utility function to print array of size n */
    static void printArray(Object arr[])
    {
        System.out.print("[ ");
        for (Object i: arr){
            System.out.print(i + " ");
        }
        System.out.println("]\n");
    }
}
