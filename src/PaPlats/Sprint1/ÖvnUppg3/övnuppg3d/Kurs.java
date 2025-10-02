package PaPlats.Sprint1.ÖvnUppg3.övnuppg3d;

import java.util.ArrayList;
import java.util.List;

public class Kurs {

    private String namn;
    private Lärare lärare;


    public Kurs() {}

    public Kurs(String namn){
        this.namn = namn;
    }

    public Kurs(String namn, Lärare lärare){
        this.namn = namn;
        this.lärare = lärare;
    }


    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }


}
