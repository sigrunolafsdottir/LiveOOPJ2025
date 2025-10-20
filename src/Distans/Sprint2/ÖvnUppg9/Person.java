package Distans.Sprint2.ÖvnUppg9;

public class Person {

    private String name;
    private String street;
    private String city;
    private int age;
    private int length;
    private int height;

    public Person(){}

    public Person(String name, String street, String city, int age, int length, int height) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.age = age;
        this.length = length;
        this.height = height;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
