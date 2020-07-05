package com.study.kotlinstudy.typecast;


import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaTypeCast {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        testList(linkedList);

    }

    public static void close(Object obj) throws IOException {
        //已经判断他是Closeable，依然需要强转
        if(obj instanceof Closeable){
            ((Closeable) obj).close();
        }

        if(obj instanceof String && ((String) obj).length() > 0){
            System.out.println("not empty");
        }
    }

    public static void testList(List<String> list){
        if (list instanceof LinkedList && !list.isEmpty()){
            String trimLast = ((LinkedList<String>) list).getLast().trim();
            System.out.println(trimLast);
        }
        //...
    }

}
