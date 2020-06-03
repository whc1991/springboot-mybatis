package com.cloud.test.factoryPattern.simpleFactoryPattern;

public class OperatorDivide extends Operator{

    @Override
    public double operation() {
        double result = 0;

        if (getParamB() == 0) {
            System.out.println("除数不能为0");
            return result;
        }

        result = getParamA() / getParamB();

        return result;
    }
}
