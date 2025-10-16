package PaPlats.Sprint2.ÖvnUppg2Bil;

import java.util.Scanner;

public class Bensinförbrukning {

    public double getAntalMilSenasteÅret(double mätarStällningFÖrEttÅrSen, double mätarStällningNu ){
        return mätarStällningNu - mätarStällningFÖrEttÅrSen;
    }

    public double  getBensinFörbrukningSenasteÅret(double antalMilDettaÅr, double antalLiterBensin ){
        return antalLiterBensin/antalMilDettaÅr;
    }

    public String getUtskriftsText(String prompt, double d){
        return prompt + d;
    }

    void main(){
        Scanner sc = new Scanner (System.in);
/*
        IO.println("Mätarställning för ett år sen: ");
        Double mätarställningFörEttÅrSen = sc.nextDouble();
        IO.println("Mätarställning nu: ");
        Double mätarställningNu = sc.nextDouble();
        IO.println("Antal liter bensin: ");
        Double antalLiterBensin = sc.nextDouble();

 */

        Double mätarställningFörEttÅrSen =
                Double.parseDouble(IO.readln("Mätarställning för ett år sen: ").trim());
        Double mätarställningNu =
                Double.parseDouble(IO.readln("Mätarställning nu: ").trim());
        Double antalLiterBensin =
                Double.parseDouble(IO.readln("Antal liter bensin: ").trim());


        double deltaMil = getAntalMilSenasteÅret(mätarställningFörEttÅrSen, mätarställningNu);
        double förbrukningPerMil = getBensinFörbrukningSenasteÅret(deltaMil,  antalLiterBensin);

        IO.println(getUtskriftsText("Antal körda mil:", deltaMil));
        IO.println(getUtskriftsText("Antal liter bensin:", antalLiterBensin));
        IO.println(getUtskriftsText("Förbrukning per mil:", förbrukningPerMil));

    }

}
