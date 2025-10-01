package Distans.Sprint1.Övningsuppgift1.Version2;

public class Bil {

    private String regNr;
    private String färg;
    private String märke;


    public Bil(String regNr, String färg, String märke){
        this.regNr = regNr;
        this.färg = färg;
        this.märke = märke;
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



    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", färg='" + färg + '\'' +
                ", märke='" + märke + '\'' +

                '}';
    }
}
