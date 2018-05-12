package com.ashik.calcengine;

/* added comment to check git dsf f sfa  */
public class Main {

    public static void main(String[] args) {


        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = {'d', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch(opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                {
                System.out.println("bad operator");
                results[i] = 0.00d;
                break;
            }

            }
//            if (opCodes[i] == 'a')
//                results[i] = leftVals[i] + rightVals[i];
//            else if (opCodes[i] == 's')
//                results[i] = leftVals[i] - rightVals[i];
//            else if (opCodes[i] == 'd')
//                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
//            else if (opCodes[i] == 'm')
//                results[i] = leftVals[i] * rightVals[i];
//            else {
//                System.out.println("bad operator");
//                results[i] = 0.00d;
//            }

        }

        for ( double theresult : results)
                    System.out.println(theresult);





    }
}
