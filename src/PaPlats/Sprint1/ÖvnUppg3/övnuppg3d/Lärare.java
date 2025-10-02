package PaPlats.Sprint1.ÖvnUppg3.övnuppg3d;

import java.util.ArrayList;
import java.util.List;

public class Lärare extends Person {

    private List<Kurs> kurser = new ArrayList<>();

    public Lärare(String namn) {
        super(namn);
    }

    public List<Kurs> getKurser() {
        return kurser;
    }

    public void setKurser(List<Kurs> kurser) {
        this.kurser = kurser;
    }

    public void addKurs(Kurs kurs) {
        kurser.add(kurs);
    }
}
