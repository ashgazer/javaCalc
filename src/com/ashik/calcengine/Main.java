package com.ashik.calcengine;

/* added comment to check git dsf f sfa  */
public class Main {

    public static void main(String[] args) {


//
//        useMathEquation();
//        useCalculatorBase();


        String[] statements = {
            "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };


         CalculateHelper helper = new CalculateHelper();

         for(String statement:statements){
            helper.process(statement);
            System.out.println(helper);

         }


    }

    static void useMathEquation() {





        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);


        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result=");
            System.out.println(equation.getResult());

        }

        System.out.println();
        System.out.println("using method overload");
        System.out.println();


        //        double newleftval = 9.0d;
        //        double newrightVal = 4.0d;

        int newleftval = 9;
        int newrightVal = 4;


        MathEquation equationWithOverload = new MathEquation('d');
        equationWithOverload.execute(newleftval, newrightVal);
        System.out.print("result=");

        System.out.println(equationWithOverload.getResult());

        equationWithOverload.execute((double) newleftval, newrightVal);
        System.out.print("result=");

        System.out.println(equationWithOverload.getResult());


    }



    static void useCalculatorBase() {




        System.out.println();
        System.out.println("-------inheritance----");
        System.out.println();


        CalculateBase[] calculators = {

                new Divisor(100.0d, 50.0d),
                new Adder(25.0d ,92.0d),
                new Subtractor(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)



        };


        for (CalculateBase something:calculators) {

            something.calculate();
            System.out.println();
            System.out.print(something.getResult());



        }


    }


}
