package PaPlats.Sprint1.ÖvnUppg3.uppg3a;

import java.util.ArrayList;
import java.util.List;

public class Kurs {

    private String namn;
    private Lärare lärare;
    private List<Student> studenter = new ArrayList<>();

    public Kurs() {}

    public Kurs(String namn){
        this.namn = namn;
    }

    public Kurs(String namn, Lärare lärare){
        this.namn = namn;
        this.lärare = lärare;
    }

    public Kurs(String namn, Lärare lärare, List<Student> studenter){
        this.namn = namn;
        this.lärare = lärare;
        this.studenter = studenter;
    }


    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public List<Student> getStudenter() {
        return studenter;
    }

    public void setStudenter(List<Student> studenter) {
        this.studenter = studenter;
    }

    public void addStudent(Student student) {
        studenter.add(student);
    }
}
