package PaPlats.Sprint1.ÖvnUppg2.Övnuppg2c;

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

        Hjulburen hb = new Bil(23, 45, 5, 2);


        List<Hjulburen> hjulfordon = new LinkedList<>();
        hjulfordon.add(b);
        hjulfordon.add(b2);
        hjulfordon.add(c);

        for(Hjulburen hj : hjulfordon) {
            System.out.println("Antal hjul: " + hj.getAntalHjul());
        }


    }
}
