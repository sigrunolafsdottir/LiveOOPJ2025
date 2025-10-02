package PaPlats.Sprint1.ÖvnUppg2.Övnuppg2c;

public class Cykel extends Fordon implements Hjulburen {

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
    public void printMe() {
        System.out.println( "Cykel{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "antalVäxlar=" + antalVäxlar +
                ", växelJustNu=" + växelJustNu +
                '}');
    }

    public void växla(int nyVäxel){
        this.växelJustNu = nyVäxel;
    }

    @Override
    public int getAntalHjul() {
        return 2;
    }
}
