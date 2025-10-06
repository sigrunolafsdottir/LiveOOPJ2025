package Distans.Sprint1.Övningsuppgift2.uppgb;

public abstract class Fordon {

    private int hastighet;
    private int vikt;

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public Fordon(){}


    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public void ändraHastighet(int nyHastighet){
        this.hastighet = nyHastighet;
    }

    public void printMe(){
        System.out.println("FORDON, Hastighet: " + hastighet + " Vikt: " + vikt);
    }
}
