package com.ashik.calcengine;

public class CalculateHelper {

    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACK_SYMBOL = '-';
    private static final char DIVIDE_SYMBOL = '/';
    private static final char MULTIPLY_SYMBOL = '*';


    MathCommand command;
    double leftVal;
    double rightVal;
    double result;


   public void process(String statement ){

       String[] parts = statement.split(" ");

       String commandString = parts[0];
       leftVal = Double.parseDouble(parts[1]);
       rightVal = Double.parseDouble(parts[2]);


       setCommandFromString(commandString);

       CalculateBase calculator = null;


       switch (command){
           case Add:
               calculator = new Adder(leftVal,rightVal);
               break;
           case Divide:
               calculator = new Divisor(leftVal, rightVal);
               break;
           case Multiply:
               calculator = new Multiplier(leftVal, rightVal);
               break;
           case Substract:
               calculator = new Subtractor(leftVal, rightVal);
               break;

       }

       calculator.calculate();
       result = calculator.getResult();


   }


   private void setCommandFromString(String commandString){

    if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
        command = MathCommand.Add;
    else if (commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
        command = MathCommand.Substract;
    else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
        command = MathCommand.Divide;
    else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
        command = MathCommand.Multiply;

   }

   @Override
   public String toString(){

       char symbol = ' ';

       switch (command){
           case Add:
               symbol = ADD_SYMBOL;
               break;
           case Substract:
               symbol = SUBTRACK_SYMBOL;
               break;
           case Multiply:
               symbol = MULTIPLY_SYMBOL;
               break;
           case Divide:
               symbol = DIVIDE_SYMBOL;
               break;

       }

       StringBuilder SB = new StringBuilder(20);
       SB.append(leftVal);
       SB.append(' ');
       SB.append(symbol);
       SB.append(' ');

       SB.append(rightVal);
       SB.append(" = ");
       SB.append(result);

       return SB.toString();





   }

}
