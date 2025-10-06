package Distans.Sprint1.Övningsuppgift2.uppgb;

public class Båt extends Fordon{

    private int dödvikt;

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public Båt(){}

    public int getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(int dödvikt) {
        this.dödvikt = dödvikt;
    }

    public void sväng(){
        System.out.println("Båten svänger");
    }

    @Override
    public void printMe(){
        System.out.println("BÅT, Hastighet: " + getHastighet() + " Vikt: " + getVikt() +  " Dödvikt: " + dödvikt);
    }

}
