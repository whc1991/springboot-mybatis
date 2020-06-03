package com.cloud.test.factoryPattern.simpleFactoryPattern;

public class OperatorMultiply extends Operator{

    @Override
    public double operation() {
        double result = 0;

        result = getParamA() * getParamB();

        return result;
    }
}
