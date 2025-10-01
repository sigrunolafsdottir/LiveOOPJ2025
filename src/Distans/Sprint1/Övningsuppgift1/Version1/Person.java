package Distans.Sprint1.Övningsuppgift1.Version1;

public class Person {

    protected int alder;
    protected String namn;


    public Person(){}

    public Person(String namn, int alder){
        this.namn = namn;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "alder=" + alder +
                ", namn='" + namn + '\'' +
                '}';
    }
}
