package PaPlats.Sprint1.Demo;

import java.util.ArrayList;
import java.util.List;

public class huvudprogramKurs {

    public static void main(String[] args) {

        Kurs kurs1 = new Kurs("Engelska");
        Kurs kurs2 = new Kurs("Matematik");
        Kurs kurs3 = new Kurs("Svenska");

        List<Kurs> kurser = new ArrayList<>();
        kurser.add(kurs1);
        kurser.add(kurs2);
        kurser.add(kurs3);



    }
}
