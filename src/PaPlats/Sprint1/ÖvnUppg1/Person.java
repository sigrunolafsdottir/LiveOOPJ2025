package PaPlats.Sprint1.ÖvnUppg1;

public class Person {

    protected String namn;
    protected int ålder;
    protected String adress;

    public Person(String namn, int ålder, String adress){
        this.namn=namn;
        this.ålder = ålder;
        this.adress=adress;
    }

    public Person(){}

    public String getNamn() {
        return namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public String getAdress(){
        return adress;
    }

    public void setNamn(String namn){
        this.namn=namn;
    }

    public void setAddress(String adress){
        this.adress=adress;
    }

    public void setÅlder(int ålder){
        this.ålder=ålder;
    }


}
