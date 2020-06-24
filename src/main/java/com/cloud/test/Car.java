package com.cloud.test;

/**
 * @description: 1
 * @author: wanghc
 * @create: 2020/6/5 下午2:06
 */
public class Car {

    private Engine engine;

    public Car() {
        this.engine = new EleEngine();
    }

    public void start(){
        engine.turnOn();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
