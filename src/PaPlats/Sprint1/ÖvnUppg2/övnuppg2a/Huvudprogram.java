package PaPlats.Sprint1.ÖvnUppg2.övnuppg2a;

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




    }
}
