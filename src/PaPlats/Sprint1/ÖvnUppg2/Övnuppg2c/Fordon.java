package PaPlats.Sprint1.ÖvnUppg2.Övnuppg2c;

public abstract class Fordon   {

    private int hastighet;
    private int vikt;

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public Fordon(){

    }

    public void printMe(){
        System.out.println("Printme in Fordon{" +
                "hastighet=" + hastighet +
                ", vikt=" + vikt +
                '}');
    }

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

    @Override
    public String toString() {
        return "Fordon{" +
                "hastighet=" + hastighet +
                ", vikt=" + vikt +
                '}';
    }

    public void ändraHastighet(int nyHastighet) {
        this.hastighet = hastighet;
    }

}
