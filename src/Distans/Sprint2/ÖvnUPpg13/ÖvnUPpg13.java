package Distans.Sprint2.ÖvnUPpg13;

import java.util.Scanner;

public class ÖvnUPpg13 {

    public boolean isOperatorAllowed(String op){
        return (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")
                || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/"));
    }

    public double calc(double d1, double d2, String op){

        return
                switch(op){
                    case "+" ->  d1 + d2;
                    case "-" ->  d1 - d2;
                    case "*" ->  d1 * d2;
                    case "/" ->  d1 / d2;
                    default -> throw new IllegalArgumentException();   //throw exception
                };
    }



}
