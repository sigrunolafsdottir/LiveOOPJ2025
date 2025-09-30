package PaPlats.Sprint1.ÖvnUppg1;

public class Bilägare extends Person{

    private Bil bil;

    public Bilägare(String namn, int ålder, String adress, Bil bil){
       // super(namn, ålder, adress);
        this.namn = namn;
        this.bil=bil;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil=bil;
    }

    public String getData(){
      /*  if (bil != null){
            return "Bil";
        }else{
            return "Ingen bil;";
        }
        */
        return namn + " " + getÅlder() + " " + getAdress() + " "
                + (bil != null ? bil : "Ingen bil");
    }

}
