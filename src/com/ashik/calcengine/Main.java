package com.ashik.calcengine;

/* added comment to check git dsf f sfa  */
public class Main {

    public static void main(String[] args) {


        double val1 =100;
        double val2 = 50;
        double result;
        char opCode = 'd';



        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 -  val2;
        else if (opCode == 'd')
            result = val1 /  val2;
        else if (opCode == 'm')
            result = val1 *  val2;
        else {
            System.out.println("bad operator");
            result = 0.00d;
        }


        System.out.println(result);


    }
}
