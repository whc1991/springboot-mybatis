package com.cloud.test.factoryPattern.simpleFactoryPattern;

/**
 * 简单工厂模式--> 静态工厂方法模式
 * 工厂角色： 负责创建所以实例的内部逻辑，可以直接被外部调用，创建所需要的产品对象
 * 抽象产品角色： 所以实例共有的公共接口
 * 具体产品角色： 某个具体类的实例
 */
public class OperationFactory {

    public static Operator createOperate(String operateType) {

        Operator operator = null;

        switch (operateType) {
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorSub();
                break;
            case "*":
                operator = new OperatorMultiply();
                break;
            case "/":
                operator = new OperatorDivide();
                break;
        }

        return operator;
    }

    public static void main(String[] args) {
        Operator operate = OperationFactory.createOperate("+");
        operate.setParamA(1);
        operate.setParamB(2);
        System.out.println(operate.operation());

        Operator operate1 = OperationFactory.createOperate("-");
        operate1.setParamA(1);
        operate1.setParamB(2);
        System.out.println(operate1.operation());

        Operator operate2 = OperationFactory.createOperate("*");
        operate2.setParamA(1);
        operate2.setParamB(2);
        System.out.println(operate2.operation());

        Operator operate3 = OperationFactory.createOperate("/");
        operate3.setParamA(1);
        operate3.setParamB(2);
        System.out.println(operate3.operation());
    }
}
