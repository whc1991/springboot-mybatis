package com.cloud.test;


public class SortTest {

    public static void main(String[] args) {

        int[] nums = {13, 56, 18, 15, 23, 89, 106};
        printArr(nums);
//        selectSort(nums);
        bubbleSort(nums);
        printArr(nums);

        System.out.println(binarySelect(nums, 19));

    }

    /**
     * 选择排序
     */
    public static void selectSort(int[] nums){
        for (int x = 0; x < nums.length-1; x++){
            for(int y = x+1; y < nums.length; y++){
                if(nums[x] > nums[y]){
                    int temp = nums[x];
                    nums[x] = nums[y];
                    nums[y] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] nums){
        for (int x = 0; x < nums.length-1; x++){
            for (int y = 0; y < nums.length-1-x; y++){
                if(nums[y] > nums[y+1]){
                    int temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                }
            }
        }
    }

    /**
     * 二分/折半查找
     */
    public static int binarySelect(int[] nums, int key){
        int min = 0;
        int max = nums.length-1;
        int mid = (min + max)/2;
        while(min < max){
           if(nums[mid] == key){
               return mid;
           }

           mid = (min + max)/2;
           if(key > nums[mid]){
                min = mid + 1;

           }

           if(key < nums[mid]){
               max = mid - 1;
           }
        }
        return mid;
    }


    private static void printArr(int[] nums){
        for (int x = 0; x < nums.length; x++){
            if (x == nums.length-1){
                System.out.print(nums[x]);
            }else {
                System.out.print(nums[x] + ",");
            }
        }

        System.out.println(" ");
    }
}
