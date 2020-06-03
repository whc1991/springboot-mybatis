package com.cloud.test.factoryPattern.factoryMethod;

import com.cloud.test.factoryPattern.simpleFactoryPattern.Operator;

public interface IFactory {

    Operator createOperator();
}
