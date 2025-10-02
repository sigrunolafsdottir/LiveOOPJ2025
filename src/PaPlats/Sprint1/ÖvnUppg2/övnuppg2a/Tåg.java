package PaPlats.Sprint1.ÖvnUppg2.övnuppg2a;

public class Tåg extends Fordon {

    private int antalVagnar;

    public Tåg() {}

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    @Override
    public String toString() {
        return "Tåg{" +
                "hastighet=" + getHastighet() +
                ", vikt=" + getVikt() +
                "antalVagnar=" + antalVagnar +
                '}';
    }

    public void kopplaVagn(boolean v){
        if (v == true) {
            this.antalVagnar += 1;
        } else {
            this.antalVagnar -= 1;
        }
    }
}
