package Distans.Sprint1.Övningsuppgift1.Version1;

public class Bilägare extends Person{

    private String körkortstyp;

    public Bilägare(String namn, int alder, String körkortstyp){
        //efter Java25 och framåt är detta tillåtet! innan skulle super alltid vara först
        this.körkortstyp = körkortstyp;
        super(namn, alder);
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
