package PaPlats.Sprint1.ÖvnUppg2.Övnuppg2c;

public class Båt extends Fordon {

    private int dödvikt;

    public Båt() {}

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public int getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(int dödvikt) {
        this.dödvikt = dödvikt;
    }

    @Override
    public void printMe() {
        System.out.println( "Båt{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "dödvikt=" + dödvikt +
                '}');
    }

    public void sväng(){
        System.out.println("Båten svänger");
    }
}
