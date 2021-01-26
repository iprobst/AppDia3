package TM;

public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("Pepe",126);
        Persona p2=new Persona("jor",6461);
        Persona p3=new Persona("sosa",19);
        Persona p4=new Persona("gabi",946);

        Persona []pArr={p1,p2,p3,p4};

        Precedable<Persona> [] pArr1=SortUtil.ordenar(pArr);

        for (Precedable p:pArr1) {
            System.out.println(p);
        }

        System.out.println();

        for (Persona px: pArr) {
            System.out.println(px);
        }
    }
}
