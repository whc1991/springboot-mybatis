package com.cloud.test;

import com.cloud.common.constant.SeasonEnum;
import com.cloud.dto.UserDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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
        //System.out.println(reverse(321));

        System.out.println("args = [" + SeasonEnum.spring.getSeq() + "]");

        int flag = 1;

        if (flag == 1){

        } else {

        }

        Integer integer = 1;
        String s = "s";
;
        boolean equals = Objects.equals("s", new String("s"));
        System.out.println("equals : " + equals);

        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1 == i2 " + (i1 == i2));

        UserDTO userDTO = new UserDTO();
        userDTO.setName("小明");
        userDTO.setAddress("北京");

        System.out.println("userDTO : " + userDTO.toString());

        UserDTO userDTO1 = new UserDTO();
        System.out.println(userDTO1.getAddress());


        List<String> list = new ArrayList<>(2);
        list.add("1");
        list.add("2");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println("array : " + array);

        String[] str = new String[]{"1", "2"};
        List<String> stringList = Arrays.asList(str);
        // stringList.add("3");

        List<String> list1 = new ArrayList<>(Arrays.asList(str));
        list1.add("3");
        System.out.println("list1.size() : " + list1.size());

        // List<? extends E> list2 = new ArrayList<String>();


        List<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3}));
        for (int i = 0; i < list3.size(); i++) {
            if(2 == list3.get(i)){
                list3.remove(i);
                i--;
            }
        }
        System.out.println("list3.size : " + list3.size());

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }

        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("key1 : " + key + " value1 : " + map.get(key));
        }

        map.forEach((k, v) -> System.out.println("key3 : " + k + " value3 : " + v));

        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = now.format(dtf);
        System.out.println("format : " + format);

        LocalDate parseDate = LocalDate.parse("2019-11-20", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("parseDate : " + parseDate);
    }
}
