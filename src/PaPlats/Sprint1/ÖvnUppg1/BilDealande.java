package PaPlats.Sprint1.ÖvnUppg1;

public class BilDealande {

    public void försäljning(Bilägare säljare, Bilägare köpare){
        köpare.setBil(säljare.getBil());
        säljare.setBil(null);
    }


}
