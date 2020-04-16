package com.hd.common.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void  main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            list.remove(i);
        }

    }

}
