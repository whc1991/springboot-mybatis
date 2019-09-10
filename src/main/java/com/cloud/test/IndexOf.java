package com.cloud.test;

/**
 *
 *
 */
public class IndexOf {


    public static void main(String[] args) {
        System.out.println(indexOf("mississippi", "ippi"));
    }

    public static int indexOf(String haystack, String needle) {
        if ("".equals(needle)){
            return 0;
        }

        if (needle.length() > haystack.length()){
            return -1;
        }

        // 最大循环次数，即可判断是否包含
        int max = haystack.length() - needle.length();

        // 得到起始位置
        int startIndex = 0;
        for (; startIndex <= max; startIndex ++ ){
            if(haystack.charAt(startIndex) == needle.charAt(0)){
                break;
            }
        }

        if (startIndex > max){
            // 未找到起始位置
            return -1;
        }

        int endIndex = startIndex + needle.length();
        while(endIndex <= haystack.length()){
            String substring = haystack.substring(startIndex, endIndex);
            if (substring.equals(needle)){
                return startIndex;
            }else {
                startIndex++;
                endIndex++;
            }
        }
        return -1;
    }
}
