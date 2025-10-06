package Distans.Sprint1.Övningsuppgift2.uppgb;

public class Cykel extends Fordon implements Hjulburen{

    private int antalVäxlar;
    private int växelJustNu;


    public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Cykel(){}

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public void växla(int nyVäxel){
        växelJustNu = nyVäxel;
    }

    @Override
    public int getAntalHjul() {
        return 2;
    }

    @Override
    public void printMe(){
        System.out.println("CYKEL, Hastighet: " + getHastighet() + " Vikt: " + getVikt() +  " AntalVäxlar: " + antalVäxlar +  " VäxelJustNu: " + växelJustNu);
    }


}
