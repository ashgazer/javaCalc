package com.ashik.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getRightVal(){return this.rightVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public double getLeftVal(){return this.leftVal;}
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public char getOpCode (){return this.opCode;}
    public void setOpCode(char opCode){this.opCode = opCode;}
    public double getResult(){return this.result;}


    public void execute(){
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
            {
                System.out.println("bad operator");
                result = 0.00d;
                break;
            }

        }
    }


}
