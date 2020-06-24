package com.cloud.test;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

public class CountDownLatchTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(5);

    static class BossThread implements Runnable{

        @Override
        public void run() {
            System.out.println("BOSS 到达会议室，等待，总共有" + countDownLatch.getCount() + "个人开会");

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("人都到齐了，开会吧。。。。。");
        }
    }



    static class EmployeeThread implements Runnable{

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName()+" 员工到达会议室！");
            countDownLatch.countDown();
        }
    }

    static class EmployeeThread1 implements Callable<Boolean> {

        private CountDownLatch mainLatch;

        private CountDownLatch childLatch;

        public EmployeeThread1(CountDownLatch mainLatch, CountDownLatch childLatch) {
            this.mainLatch = mainLatch;
            this.childLatch = childLatch;
        }

        @Override
        public Boolean call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" 员工到达会议室！");
            childLatch.countDown();
            System.out.println(Thread.currentThread().getName()+" 员工等待签到！");

            mainLatch.await();
            System.out.println(Thread.currentThread().getName()+" 员工已签到！");
            return true;
        }
    }

    public static void main(String[] args) {

        /*new Thread(new BossThread()).start();

        for (int i = 0; i < 5; i++) {
            new Thread(new EmployeeThread()).start();
        }*/

        CountDownLatch mainLatch = new CountDownLatch(1);

        CountDownLatch childLatch = new CountDownLatch(50);

        System.out.println("BOSS 到达会议室，等待，总共有" + 50 + "个人开会");

        for (int i = 0; i < 50; i++) {

            new Thread(new FutureTask<Boolean>(new EmployeeThread1(mainLatch, childLatch))).start();

        }

        try {
            childLatch.await();
            System.out.println(" 员工准备签到！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mainLatch.countDown();
        }

        System.out.println("人都到齐了，开会吧。。。。。");
    }
}
