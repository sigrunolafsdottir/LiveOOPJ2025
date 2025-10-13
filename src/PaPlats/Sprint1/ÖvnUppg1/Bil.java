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

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    @Override
    public String toString() {
        return regNr + " " + märke + " " + färg;
    }

    public int addMath(int a, int b) {
        return a + b;
    }
}
