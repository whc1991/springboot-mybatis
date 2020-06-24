package com.cloud.test;

/**
 * @description: 1
 * @author: wanghc
 * @create: 2020/6/5 下午2:04
 */
public class CombustionEngine implements Engine{

    @Override
    public void turnOn() {
        System.out.println("燃油引擎启动");
    }
}
