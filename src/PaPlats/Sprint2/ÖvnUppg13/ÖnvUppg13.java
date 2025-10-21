package PaPlats.Sprint2.ÖvnUppg13;

import PaPlats.Sprint2.ÖvnUppg9.ÖvnUppg9;

import java.util.Scanner;

public class ÖnvUppg13 {

    Scanner sc = new Scanner(System.in);

    public double calc(double d1, double d2, String op) throws IllegalOperatorException {
        double res = 0;
        if (checkValidOperator(op)){
            return switch(op){
                case "+" ->  d1 + d2;
                case "-" ->  d1 - d2;
                case "*" ->  d1 * d2;
                case "/" ->  d1 / d2;
                default -> throw new IllegalOperatorException("Unexpected value: " + op);
            };
        }
        throw new IllegalOperatorException("Unexpected value: " + op);
    }

    public boolean checkValidOperator(String op){
        return
                switch(op){
                    case "+" ->  true;
                    case "-" ->  true;
                    case "*" ->  true;
                    case "/" ->  true;
                    default ->  false;
            };
    }

    public ÖnvUppg13(){
        double d1 = sc.nextDouble();
        String op = sc.next();
        double d2 = sc.nextDouble();

        try{
            IO.println( calc(d1, d2, op));
        }
        catch(IllegalOperatorException e){

            IO.println(e.getMessage());

            e.printStackTrace();
        }
    }


    void main(){
        ÖnvUppg13 uppg = new ÖnvUppg13();
    }

}
