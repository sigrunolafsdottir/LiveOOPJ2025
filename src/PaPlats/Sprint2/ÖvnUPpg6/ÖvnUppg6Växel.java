package PaPlats.Sprint2.ÖvnUPpg6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ÖvnUppg6Växel {

    public boolean test = false;
    Scanner sc = new Scanner(System.in);
    final static List<Integer> valörer = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int getVäxel(int kostnad, int betaltBelopp ){
        return betaltBelopp - kostnad;
    }

    public List<Integer> getValörer(){
        return valörer;
    }

    public int getAmountOfValör(int valör, int växel){
        return växel / valör;
    }

    //bättre metod nedan
    public int getRest(int växel, int valör, int antalValör){
        return växel - (valör * antalValör);
    }

    public int getRestModulu(int växel, int valör){
        return växel % valör;
    }

    public List<Integer> getVäxelList(int växel){
        List<Integer> list = new ArrayList<>();
        for(Integer valör : valörer){
            int amount = getAmountOfValör(valör, växel);
            list.add(amount);
            växel = getRestModulu(växel, valör);  //dra av på växeln
        }
        return list;
    }

    public String getPengatyp(int valör){
        if (valör < 20 ) return "kronor";
        return "lappar";
    }

    public String getUtskrift(int valör, int antal){
        StringBuilder sb = new StringBuilder();
        sb.append("Antal ");
        sb.append(valör);
        sb.append("-");
        sb.append(getPengatyp(valör));
        sb.append(": ");
        sb.append(antal);
        return sb.toString();
       // return "Antal "+valör+"-"+getPengatyp(valör)+": "+antal;
    }


    //inläsningsfunktion
    //inparameter: prompt, testvariabel
    //utparameter antingen det vi läsar från consolen ELLER testparam

    public int readData (String prompt, int testdata){
        if (!test){
            IO.println(prompt);
            int data = sc.nextInt();
            return data;
        } else{
            return testdata;
        }
    }



    public void main(){

        int kostnad = readData("Skriv in kostnaden: ", -1);
        int betaltBelopp = readData("Skriv in det du betalade: ", -1);

        int växel = getVäxel(kostnad, betaltBelopp);
        List<Integer> växelListan = getVäxelList(växel);
        for (int i = 0; i < växelListan.size(); i++) {
            IO.println(getUtskrift(valörer.get(i), växelListan.get(i)));
        }
    }

}
