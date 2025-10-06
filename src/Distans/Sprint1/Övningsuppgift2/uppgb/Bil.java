package Distans.Sprint1.Övningsuppgift2.uppgb;

public class Bil extends Fordon implements Hjulburen{

    private int antalVäxlar;
    private int växelJustNu;


    public Bil(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Bil(){}

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
        return 4;
    }

    @Override
    public void printMe(){
        System.out.println("BIL, Hastighet: " + getHastighet() + " Vikt: " + getVikt() +  " AntalVäxlar: " + antalVäxlar +  " VäxelJustNu: " + växelJustNu);
    }
}
