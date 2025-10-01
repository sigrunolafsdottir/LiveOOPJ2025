package Distans.Sprint1.Övningsuppgift1.Version2;

public class Bilägare extends Person {

    private String körkortstyp;

    private Bil bil;

    public Bilägare(String namn, int alder, String körkortstyp, Bil bil){
        super(namn, alder);
       // this.namn = namn;
       // this.alder = alder;
        this.körkortstyp = körkortstyp;
        this.bil = bil;
    }

    public String getKörkortstyp() {
        return körkortstyp;
    }

    public void setKörkortstyp(String körkortstyp) {
        this.körkortstyp = körkortstyp;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public String köpaBil(Bil nyaBilen) {
        if (bil == null){
            setBil(nyaBilen);
            return "Du har köpt en ny bil";
        }
        else{
            return "Du har redan en bil";
        }
    }

    @Override
    public String toString() {
        return "Bilägare{" +
                "körkortstyp='" + körkortstyp + '\'' +
                "bil='" + bil + '\'' +
                ", alder=" + alder +
                ", namn='" + namn + '\'' +
                '}';
    }
}
