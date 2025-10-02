package PaPlats.Sprint1.ÖvnUppg3.övnuppg3d;

import java.util.List;

public class Utskrifter {

    public void printStudent(Student s, List<Deltagande> deltagande){
        System.out.println("Namn: " + s.getNamn());
        for( Deltagande d : deltagande){
            if (d.getS().getNamn().equals(s.getNamn())){
                System.out.println("Kurs: " + d.getK().getNamn());
            }
        }
    }

    public void printKurs(Kurs k, List<Deltagande> deltagande){
        System.out.println("Kursnamn: "+ k.getNamn());
        System.out.println("Lärare: "+ k.getLärare().getNamn());

        for( Deltagande d : deltagande){
            if (d.getK().getNamn().equals(k.getNamn())){
                System.out.println("Student: " + d.getS().getNamn());
            }
        }
    }


}
