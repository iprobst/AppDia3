package TT;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) throws Exception {

        Properties properties= new Properties();
        InputStream configInput;
        String propiedad = "";
        String path = "/Users/iprobst/IdeaProjects/AppDia3/src/MiFactory.properties";
        Class clase;
        Object o = new Object();

        configInput = new FileInputStream(path);
        properties.load(configInput);
        propiedad = properties.getProperty(objName);
        clase = Class.forName(propiedad);

            return clase.getDeclaredConstructor().newInstance();
        }
    }

//    public static Object getInstance(String objName) throws Exception {
//
//        switch (objName){
//            case "QuickSortSorterImple":
//                return new QuickSortSorterImple();
//            case "HeapSortSorterImple":
//                return new HeapSortSorterImple();
//            case "BubbleSortSorterImple":
//                return new BubbleSortSorterImple();
//            default:
//                throw new Exception("Clase no encontrada");
//        }
//    }

