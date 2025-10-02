package PaPlats.Sprint1.ÖvnUppg3.uppg3a;

import java.util.ArrayList;
import java.util.List;

public class HuvudprogramSkola {


    public static void main(String[] args) {

        Lärare sigrun = new Lärare("Sigrun");

        Student s1 = new Student("Anna");
        Student s2 = new Student("Bob");
        Student s3 = new Student("David");
        Student s4 = new Student("Elin");

        List<Student> studenter = new ArrayList<>();
        studenter.add(s1);
        studenter.add(s2);
        studenter.add(s3);
        studenter.add(s4);

        List<Student> studenterFP = new ArrayList<>();
        studenterFP.add(s1);
        studenterFP.add(s2);
        studenterFP.add(s3);

        Kurs javaOOPJ = new Kurs("Objektorienterad programmering i Java", sigrun, studenter);
        Kurs databaser = new Kurs("Databasteknik", sigrun, studenter);
        Kurs fp = new Kurs("Funktionell Programmering", sigrun, studenterFP);


        System.out.println("Kursnamn: " + javaOOPJ.getNamn() );
        System.out.println("Läraren: " + javaOOPJ.getLärare().getNamn() );

        for(Student student : javaOOPJ.getStudenter()) {
            System.out.println("Student: " + student.getNamn());
        }

        System.out.println();

        s4.addKurs(javaOOPJ);
        s4.addKurs(fp);

        System.out.println("Namn: " + s4.getNamn() );
        for(Kurs kurs : s4.getKurser()) {
            System.out.println("Kurs: " + kurs.getNamn());
        }


    }
}
