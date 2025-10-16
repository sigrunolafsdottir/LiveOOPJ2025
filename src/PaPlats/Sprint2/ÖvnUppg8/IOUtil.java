package PaPlats.Sprint2.ÖvnUppg8;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtil {

    public static List<Double> readFromFile(Path path){
        List<Double> list = new ArrayList<>();
        try(Scanner sc = new Scanner(path)){
            while (sc.hasNextDouble()){
                list.add(sc.nextDouble());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
