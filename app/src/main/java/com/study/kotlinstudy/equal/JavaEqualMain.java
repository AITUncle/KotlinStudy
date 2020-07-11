package com.study.kotlinstudy.equal;

public class JavaEqualMain {

    public static void main(String[] args) {
        intEqual();
        stringEqual();
        System.out.println("isTextEqual : " + isTextEqual(null, null));
    }

    public static void intEqual(){
        Integer int127First = 127;
        Integer int127Second = 127;
        System.out.println("int127First == int127Second :" + (int127First == int127Second));

        Integer int128First = 128;
        Integer int128Second = 128;
        System.out.println("int128First == int128Second :" + (int128First == int128Second));

    }

    public static void stringEqual(){
        String strBuilder1 = new StringBuilder("IT互联网大叔").toString();
        String strBuilder2 = new StringBuilder("IT互联网大叔").toString();
        System.out.println("strBuilder1 == strBuilder2 :" + (strBuilder1 == strBuilder2));


        String str1 = "IT互联网大叔";
        String str2 = "IT互联网大叔";
        System.out.println("str1 == str2 :" + (str1 == str2));
    }

    /**
     * 判断字符串是否相等
     */
    public static boolean isTextEqual(String str1, String str2){
        if(str1 == str2){
            return true;
        }
        if(str1 != null && str2 != null){
            return str1.equals(str2);
        }
        return false;
    }

}
