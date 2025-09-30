package PaPlats.Sprint1.ÖvnUppg1;

public class Övnuppg1c {

    public static void main(String[] args) {

        Bil b = new Bil ("ASD123", "Volvo", "Röd");
        Bil b2 = new Bil("fgh123", "BMW", "Blå");

        Bilägare bengt = new Bilägare("Bengt", 45, "Gatan 1", b);
        Bilägare berta = new Bilägare("Berta", 45, "Gatan 1", b);

        Bilägare cilla = new Bilägare("Cilla", 45, "Gatan 1", null);

        System.out.println(cilla.getData());

        BilDealande bd = new BilDealande();
        bd.försäljning(berta, cilla);

        System.out.println(cilla.getData());

    }




}
