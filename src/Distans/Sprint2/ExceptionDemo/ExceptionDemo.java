package Distans.Sprint2.ExceptionDemo;

import java.util.Scanner;

public class ExceptionDemo {

    Scanner sc = new Scanner(System.in);


    public void myMethod() throws MyOwnException {
        //double d = sc.nextDouble();
        throw new MyOwnException("Det blev fel");
    }



    public ExceptionDemo() throws MyOwnException {

    //    try {
            myMethod();
     /*   }
        catch(Exception e) {
            System.out.println("fel format");
            e.printStackTrace();
        }

      */

        System.out.println("efter att det blivit fel");
    }


    void main(){
       // ExceptionDemo demo = new ExceptionDemo();
    }


}
