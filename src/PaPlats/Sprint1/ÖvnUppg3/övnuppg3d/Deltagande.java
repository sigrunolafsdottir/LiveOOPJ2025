package PaPlats.Sprint1.ÖvnUppg3.övnuppg3d;

public class Deltagande {

    private Student s;
    private Kurs k;

    public Deltagande(){}

    public Deltagande(Student s, Kurs k) {
        this.s = s;
        this.k = k;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Kurs getK() {
        return k;
    }

    public void setK(Kurs k) {
        this.k = k;
    }
}
