package PaPlats.Sprint1.ÖvnUppg2.Övnuppg2c;

public class Bil extends Fordon implements Hjulburen, Printable {

    private int antalVäxlar;
    private int växelJustNu;
    private int antalHjul = 4;

    public Bil() {}

    public Bil(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    @Override
    public void printMe(){
        System.out.println("Printme in Bil{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "antalVäxlar=" + antalVäxlar +
                ", växelJustNu=" + växelJustNu +
                '}');
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
        return "Bil{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "antalVäxlar=" + antalVäxlar +
                ", växelJustNu=" + växelJustNu +
                '}';
    }

    public void växla(int nyVäxel){
        this.växelJustNu = nyVäxel;
    }

    @Override
    public int getAntalHjul() {
        return antalHjul;
    }
}
