package com.cloud.test.factoryPattern.simpleFactoryPattern;

public abstract class Operator {

    private double paramA;

    private double paramB;

    public abstract double operation();

    public double getParamA() {
        return paramA;
    }

    public void setParamA(double paramA) {
        this.paramA = paramA;
    }

    public double getParamB() {
        return paramB;
    }

    public void setParamB(double paramB) {
        this.paramB = paramB;
    }
}
