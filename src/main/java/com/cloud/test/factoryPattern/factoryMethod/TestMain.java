package com.cloud.test.factoryPattern.factoryMethod;

import com.cloud.test.factoryPattern.simpleFactoryPattern.Operator;

public class TestMain {

    public static void main(String[] args) {
        IFactory addFactory = new AddFactory();
        Operator operator = addFactory.createOperator();
        operator.setParamA(1);
        operator.setParamB(4);
        System.out.println(operator.operation());


        IFactory iFactory = new SubFactory();
        Operator operator1 = iFactory.createOperator();
        operator1.setParamA(1);
        operator1.setParamB(4);
        System.out.println(operator1.operation());
    }
}
