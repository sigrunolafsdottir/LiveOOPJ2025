package Distans.Sprint1.Övningsuppgift1.Version1;

public class Bilägare extends Person{

    private String körkortstyp;

    public Bilägare(String namn, int alder, String körkortstyp){
        super(namn, alder);
       // this.namn = namn;
       // this.alder = alder;
        this.körkortstyp = körkortstyp;
    }

    @Override
    public String toString() {
        return "Bilägare{" +
                "körkortstyp='" + körkortstyp + '\'' +
                ", alder=" + alder +
                ", namn='" + namn + '\'' +
                '}';
    }
}
