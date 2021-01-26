package TM;

public class SortUtil{
    /*private T v;

    public SortUtil(T v) {
        this.v = v;
    }*/

    public static <T> Precedable<T>[] ordenar(Precedable<T> arr[]){
        Precedable<T> auxiliar;
        Precedable<T> [] arregloOrdenado;
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0;j < arr.length-i;j++)
            {
                if(arr[j].precedeA((T) arr[j+1])>0)
                {
                    auxiliar = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arr;
        return  arregloOrdenado;

    }

}
