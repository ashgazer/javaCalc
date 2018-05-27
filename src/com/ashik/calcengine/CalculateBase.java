package com.ashik.calcengine;

public abstract class CalculateBase {

    private double leftVal;
    private double rightVal;
    private double result;


    public double getLeftVal(){ return leftVal; }
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public double getResult(){return result;}
    public void setResult(double result){this.result = result;}

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal) {
        this.rightVal = rightVal;
        this.leftVal = leftVal;


    }

    public abstract void calculate();

}
