package PaPlats.Sprint1.ÖvnUppg1;

public class Bil {

    private String regNr;
    private String märke;
    private String färg;

    public Bil(String regNr, String märke, String färg){
        this.regNr=regNr;
        this.märke=märke;
        this.färg=färg;
    }


    @Override
    public String toString() {
        return regNr + " " + märke + " " + färg;
    }
}
