package com.cloud.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TryCatchFinallyTest {

    public String test(){

        String s = "1a";

        String rtn = "rtn";

        try {
            int parseInt = Integer.parseInt(s);
            rtn = parseInt + "";
            return rtn;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return  "error";
        } finally {
            System.out.println("finally start......");
            rtn = "finally";
            System.out.println("finally  end......");
        }


    }

    public static void main(String[] args) {
        System.out.println("test : " + new TryCatchFinallyTest().test());
    }
}
