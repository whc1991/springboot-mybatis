package com.cloud;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        /*List<Integer> intList = new ArrayList<>();

        for (int i = 1; i < 1000; i++ ){
             intList.add(i);
        }

        Integer integer = intList.parallelStream().max(Integer::compare).get();
        System.out.println(integer);*/

        List<String> userRoleCodeList = new ArrayList<>();
        userRoleCodeList.add("admin1");

        List<String> rolePermissionList = new ArrayList<>();
        rolePermissionList.add("admin2");

        int roleSize = new HashSet<String>(userRoleCodeList).size();
        int permissionSize = new HashSet<String>(rolePermissionList).size();
        userRoleCodeList.addAll(rolePermissionList);
        System.out.println(new HashSet<String>(userRoleCodeList).size() < (roleSize + permissionSize));
    }
}
