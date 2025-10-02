package PaPlats.Sprint1.ÖvnUppg2.övnuppg2b;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Huvudprogram {

    public static void main(String[] args) {

        Bil b = new Bil(120, 1500, 6, 3);
        Bil b2 = new Bil(120, 1500, 6, 3);
        Cykel c = new Cykel(120, 1500, 6, 3);
        Båt båt = new Båt(23, 340, 500);
        Tåg t = new Tåg(300, 2000, 10);

        //Fordon f = new Fordon(23, 34);

        b.printMe();
        c.printMe();
        båt.printMe();
        t.printMe();

        System.out.println();

        Fordon f1 = new Bil(23, 45, 5, 2);
        Fordon f2 = new Tåg(23, 45, 5);
        Fordon f3 = new Båt(23, 45, 3000);

        f1.printMe();
        f2.printMe();
        f3.printMe();
        System.out.println();

        Fordon[] fordonsArray = new Fordon[5];
        fordonsArray[0] = b;
        fordonsArray[1] = c;
        fordonsArray[2] = båt;
        fordonsArray[3] = t;
        fordonsArray[4] = f1;

        for (Fordon f : fordonsArray) {
            f.printMe();
        }

        System.out.println();

        List<Fordon> fordonslista = new LinkedList<>();
        List<Fordon> fordonslistaLinked = new LinkedList<>();

        fordonslista.add(f1);
        fordonslista.add(b);
        fordonslista.add(c);
        fordonslista.add(båt);

        for (Fordon f : fordonslista) {
            f.printMe();
        }

        System.out.println();
        fordonslistaLinked.add(f1);
        fordonslistaLinked.add(b);
        fordonslistaLinked.add(c);
        fordonslistaLinked.add(båt);

        for (Fordon f : fordonslistaLinked) {
            f.printMe();
        }

        List<Fordon> merLista = List.of(båt, b, c, f1);

        for (Fordon f : merLista) {
            f.printMe();
        }

        //merLista.add(f1);
    }
}
