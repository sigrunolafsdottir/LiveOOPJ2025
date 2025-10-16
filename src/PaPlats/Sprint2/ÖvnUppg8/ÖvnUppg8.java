package PaPlats.Sprint2.ÖvnUppg8;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ÖvnUppg8 {


    //göra inläsning   - ange path -> Lista av siffror
    //göra uträkningar : LIsta -> tal  KLART
    //transformera string -> tal
    //göra utskrift

    void main(){

        Path path = Path.of("src/PaPlats/Sprint2/ÖvnUppg8/temp.txt");
        List<Double> list = IOUtil.readFromFile(path);

        for (Double d : list){
            IO.println(d);
        }

        IO.println();
        IO.println(CalculationUtil.getHighestVal(list));
        IO.println(CalculationUtil.getLowestVal(list));
        IO.println(CalculationUtil.getAverageVal(list));

    }


}
