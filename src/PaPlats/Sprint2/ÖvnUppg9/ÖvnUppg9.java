package PaPlats.Sprint2.ÖvnUppg9;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ÖvnUppg9 {


    public boolean isTall(Person p, int limit){
        return (p.getLength() >= limit);
    }

    //Kalle Nilsson, Xvägen 1, 12345 Ystad
    //25, 80, 175

    public List<Person> readPersonLista(Path path){
        List<Person> list = new ArrayList<>();

        try(Scanner sc = new Scanner(path)){
            while (true) {
                String firstLine = "";
                String secondLine = "";

                if (!sc.hasNextLine()) {
                    break;
                }

                if (sc.hasNextLine()) {
                    firstLine = sc.nextLine();
                }
                if (sc.hasNextLine()) {
                    secondLine = sc.nextLine();
                }
                String[] firstLineSplit = firstLine.split(",");
                String[] secondLineSplit = secondLine.split(",");

             /*   if (firstLine.equals("")){
                    break;
                }*/

                Person temp = new Person(firstLineSplit[0].trim(),
                        firstLineSplit[1].trim(),
                        firstLineSplit[2].trim(),
                        Integer.parseInt(secondLineSplit[0].trim()),
                        Integer.parseInt(secondLineSplit[1].trim()),
                        Integer.parseInt(secondLineSplit[2].trim()));

                list.add(temp);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }




}
