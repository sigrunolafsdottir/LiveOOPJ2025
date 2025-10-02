package PaPlats.Sprint1.ÖvnUppg3.övnuppg3d;

import PaPlats.Sprint1.ÖvnUppg2.övnuppg2a.Huvudprogram;

import java.util.ArrayList;
import java.util.List;

public class HuvudprogramSkola {

    public int importantNumber = 500;


    public HuvudprogramSkola(){
        Lärare sigrun = new Lärare("Sigrun");

        Student s1 = new Student("Anna");
        Student s2 = new Student("Bob");
        Student s3 = new Student("David");
        Student s4 = new Student("Elin");

        Kurs javaOOPJ = new Kurs("Objektorienterad programmering i Java", sigrun);
        Kurs databaser = new Kurs("Databasteknik", sigrun);
        Kurs fp = new Kurs("Funktionell Programmering", sigrun);

        Deltagande d1 = new Deltagande(s1, javaOOPJ);
        Deltagande d2 = new Deltagande(s2, javaOOPJ);
        Deltagande d3 = new Deltagande(s3, javaOOPJ);
        Deltagande d4 = new Deltagande(s4, javaOOPJ);

        Deltagande d5 = new Deltagande(s1, databaser);
        Deltagande d6 = new Deltagande(s2, databaser);
        Deltagande d7 = new Deltagande(s3, databaser);
        Deltagande d8 = new Deltagande(s4, databaser);

        Deltagande d9 = new Deltagande(s1, fp);
        Deltagande d10 = new Deltagande(s2, fp);
        Deltagande d11 = new Deltagande(s3, fp);

        List<Deltagande> deltagande = List.of(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11);

        System.out.println(importantNumber);

        Utskrifter utskrifter = new Utskrifter();
        utskrifter.printKurs(javaOOPJ, deltagande);
        System.out.println("--------------");
        utskrifter.printStudent(s2, deltagande);
    }


    public static void main(String[] args) {

       HuvudprogramSkola h = new HuvudprogramSkola();

    }
}
