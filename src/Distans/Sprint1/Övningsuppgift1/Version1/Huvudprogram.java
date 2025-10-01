package Distans.Sprint1.Övningsuppgift1.Version1;

public class Huvudprogram {

    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p);

        Bil b1 = new Bil("ASD123", "gul", "Volvo", null);
        Bil b2 = new Bil("ZXC456", "röd", "Saab", null);
        Bil b3 = new Bil("ERT234", "blå", "Fiat", null);
        Bil b4 = new Bil("TER567", "vit", "BMW", null);

        Bilägare bengt = new Bilägare("Bengt", 45, "B");
        Bilägare anna = new Bilägare("Anna", 34, "B");
        Bilägare carl = new Bilägare("Carl", 23, "C");

        b1.setBilägare(bengt);
        b2.setBilägare(anna);
        b3.setBilägare(carl);
        b4.setBilägare(bengt);

        System.out.println(b1.toString());
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        b2.sellCarTo(bengt);

        System.out.println(" ");
        System.out.println(b2);

    }
}
