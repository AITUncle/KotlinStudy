package com.study.kotlinstudy.destructuring;

import java.util.HashMap;
import java.util.Map;


public class JavaMainDestructuring {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
