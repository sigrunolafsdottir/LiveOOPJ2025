package PaPlats.Sprint2.ÖvnUppg9;

//Sune Samuelsson, Xvägen 8, 12345 Ystad
//38, 98, 175

public class Person {

    private String name;
    private String street;
    private String city;
    private int age;
    private int weight;
    private int length;

    public Person(){}

    public Person(String name, String street, String city, int age, int weight, int length) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
