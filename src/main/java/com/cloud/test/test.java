package com.cloud.test;

/**
 *
 *
 */
public class test {

    public static int reverse(int x){
        int ret = 0;
        while(x != 0){
            if(ret > Integer.MAX_VALUE / 10){
                return 0;
            }

            if(ret < Integer.MIN_VALUE / 10){
                return 0;
            }

            ret *= 10;
            int pop = x % 10;
            if(pop > 0 && ret > Integer.MIN_VALUE - pop){
                return 0;
            }

            if(pop < 0 && ret < Integer.MIN_VALUE - pop){
                return 0;
            }

            ret += pop;
            x /= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
    }
}
