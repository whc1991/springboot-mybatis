package com.cloud.test;


/**
 * 最后一个单词的长度
 */
public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("H "));
//        String s = "   ";
//        System.out.println(s.split(" ").length);
    }

    public static int lengthOfLastWord(String s) {

        if (s.equals("") || s.equals(" ")){
            return 0;
        }

        String[] split = s.split(" ");
        // 如果只有空格"   "
        if (split.length == 0){
            return 0;
        }

        if (split.length == 1){
            return split[0].length();
        }

        return split[split.length -1].length();

    }
}
