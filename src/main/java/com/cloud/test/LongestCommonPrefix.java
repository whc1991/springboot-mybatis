package com.cloud.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长的公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {


        if(strs.length == 0){
            return "";
        }

        if (strs[0].equals("")){
            return "";
        }

        // 得到最小的字符串作为基准，如果数组里面存在空字符串，返回“”
        String base = strs[0];
        for (int i = 1; i <= strs.length -1; i++){
            if(strs[i].equals("")){
                return "";
            }

            if (base.length() > strs[i].length()){
                base = strs[i];
            }
        }

        // 拿到每个char 放在set中，如果set.size() > 1就结束
        int j = 0;
        for (; j < base.length(); j++){
            Set<Character> set = new HashSet<>();
            for (String str : strs){
                char c = str.charAt(j);
                set.add(c);
            }
            if (set.size() > 1){
                break;
            }
        }

        return base.substring(0, j);
    }
}
