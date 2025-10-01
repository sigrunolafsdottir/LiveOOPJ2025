package Distans.Sprint1.Övningsuppgift1.Version2;

public class Huvudprogram {

    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p);

        Bil b1 = new Bil("ASD123", "gul", "Volvo");
        Bil b2 = new Bil("ZXC456", "röd", "Saab");
        Bil b3 = new Bil("ERT234", "blå", "Fiat");
        Bil b4 = new Bil("TER567", "vit", "BMW");

        Bilägare bengt = new Bilägare("Bengt", 45, "B", b1);
        Bilägare anna = new Bilägare("Anna", 34, "B", b2);
        Bilägare carl = new Bilägare("Carl", 23, "C", b3);
        Bilägare doris = new Bilägare("Doris", 23, "C", null);


        System.out.println(b1.toString());
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(" ");

        System.out.println(bengt);
        System.out.println(anna);
        System.out.println(carl);
        System.out.println(doris);
        System.out.println(" ");

        //carl.setBil(b1);
        System.out.println(doris.köpaBil(b4));

        System.out.println(bengt);
        System.out.println(anna);
        System.out.println(carl);
        System.out.println(doris);
        System.out.println(" ");
    }
}
