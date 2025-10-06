package Distans.Sprint1.Övningsuppgift2.uppgb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Huvudprogram {

    Bil b = new Bil(45, 34, 3, 2);
    Tåg tåg = new Tåg(78, 90, 5);
    Båt båt = new Båt(56, 78, 90);
    Cykel cykel = new Cykel(34, 35, 2, 1);

    Fordon f = new Cykel(45, 56, 3, 2);
    Hjulburen h = new Bil(84, 72, 5, 1);

    public Huvudprogram(){

        //List<Object> minaFordon = new ArrayList<>();
        List<Fordon> minaFordon = new LinkedList<>();
        minaFordon.add(f);
        minaFordon.add(b);
        minaFordon.add(tåg);
        minaFordon.add(båt);
        minaFordon.add(cykel);
        //minaFordon.add("hej");

        for(Object fordon : minaFordon){
            if (fordon instanceof Fordon x){
                x.printMe();
            }
            else {
                System.out.println(fordon);
            }
           // temp.printMe();   //polymorfism
        }

        System.out.println();
        List<Hjulburen> hjulList = new LinkedList<>();
        hjulList.add(b);
        hjulList.add(cykel);
        hjulList.add(h);

        for (Hjulburen hj : hjulList) {
            System.out.println("Antal hjul: " + hj.getAntalHjul());  //polymorfism
        }

    }

    public static void main(String[] args) {
        //System.out.println(b);  // not working because of static
        Huvudprogram h = new Huvudprogram();
    }


}
