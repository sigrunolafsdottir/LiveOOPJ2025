package Distans.Sprint1.Övningsuppgift2.uppgb;

public class Tåg extends Fordon {

    private int antalVagnar;

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public Tåg() {
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }


    public void kopplaVagn(int antalextravagnar) {
        antalVagnar += antalextravagnar;
    }

    @Override
    public void printMe(){
        System.out.println("TÅG, Hastighet: " + getHastighet() + " Vikt: " + getVikt() +  " antalVagnar: " + antalVagnar);
    }

}