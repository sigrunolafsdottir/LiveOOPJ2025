package Distans.Sprint2.ÖvnUppg9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TallPeopleProgram {

    public int convertString2Int(String s){
        return Integer.parseInt(s.trim());
    }


    public List<Person> readPersons(Path path)  {
        List<Person> allaPersoner = new ArrayList();

        try(BufferedReader buf = new BufferedReader(new FileReader(path.toString()))){

            //Sune Samuelsson, Xvägen 8, 12345 Ystad
            //38, 98, 175

            String temp1 = "";
            while((temp1 = buf.readLine()) != null){
                temp1 += ", "+ buf.readLine();

                String[] arr1 = temp1.split(",");   // =>  [ "Sune Samuelsson", "Xvägen 8", "12345 Ystad", "38", "98", "175"]
                Person temp = new Person (arr1[0], arr1[1], arr1[2], convertString2Int(arr1[3]),  convertString2Int(arr1[4]), convertString2Int(arr1[5]));
                allaPersoner.add(temp);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }


        return allaPersoner;
    }

}
