package PaPlats.Sprint1.ÖvnUppg2.övnuppg2a;

public class Cykel extends Fordon {

    private int antalVäxlar;
    private int växelJustNu;

    public Cykel() {}

    public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    @Override
    public String toString() {
        return "Cykel{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "antalVäxlar=" + antalVäxlar +
                ", växelJustNu=" + växelJustNu +
                '}';
    }

    public void växla(int nyVäxel){
        this.växelJustNu = nyVäxel;
    }
}
