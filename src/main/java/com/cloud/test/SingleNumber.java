package com.cloud.test;

/**
 *
 *
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int ret = nums[0];
        for (int i = 1; i <= nums.length -1; i++){
            ret = ret ^ nums[i];
        }
        return ret;
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length <= 0){
            return false;
        }
        /*int index = 0;
        int ret = nums[index];
        while (index < nums.length -1){
            for (int i = index + 1; i <= nums.length -1; i++){
                if (ret == nums[i]){
                    return true;
                }
                if (i == nums.length -1 && ret != nums[nums.length -1] && index < nums.length -1){
                    ret = nums[index + 1];
                    index++;
                }
            }
        }*/

        /*for (int i = 0; i <= nums.length -1; i++){
            for (int j = 0; j<i;j++){
                if (nums[j] == nums[i]){
                    return true;
                }
            }
        }*/

        for (int i = 0; i <= nums.length -1; i++){
            for (int j = i+1; j<=nums.length -1;j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println( 2 ^ 3);

//        System.out.println(singleNumber(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
}
