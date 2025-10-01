package Distans.Sprint1.Övningsuppgift1.Version1;

public class Bil {

    private String regNr;
    private String färg;
    private String märke;

    private Bilägare bilägare;

    public Bil(String regNr, String färg, String märke, Bilägare bilägare){
        this.regNr = regNr;
        this.färg = färg;
        this.märke = märke;
        this.bilägare = bilägare;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public void setBilägare(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    public void sellCarTo(Bilägare nyägare){
        setBilägare(nyägare);
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", färg='" + färg + '\'' +
                ", märke='" + märke + '\'' +
                ", bilägare=" + bilägare +
                '}';
    }
}
