package com.cloud.test.factoryPattern.factoryMethod;

import com.cloud.test.factoryPattern.simpleFactoryPattern.Operator;
import com.cloud.test.factoryPattern.simpleFactoryPattern.OperatorAdd;
import com.cloud.test.factoryPattern.simpleFactoryPattern.OperatorSub;

public class SubFactory implements IFactory{
    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
}
