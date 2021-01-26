package TT;

public class MiFactory {

    public static Object getInstance(String objName) throws Exception {

        switch (objName){
            case "QuickSortSorterImple":
                return new QuickSortSorterImple();
            case "HeapSortSorterImple":
                return new HeapSortSorterImple();
            case "BubbleSortSorterImple":
                return new BubbleSortSorterImple();
            default:
                throw new Exception("Clase no encontrada");
        }
    }
}
