package com.cloud.test.factoryPattern.factoryMethod;

import com.cloud.test.factoryPattern.simpleFactoryPattern.Operator;
import com.cloud.test.factoryPattern.simpleFactoryPattern.OperatorAdd;

public class AddFactory implements IFactory{
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }

}
