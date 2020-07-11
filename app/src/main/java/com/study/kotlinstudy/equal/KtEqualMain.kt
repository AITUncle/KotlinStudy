package com.study.kotlinstudy.equal



fun main() {
    intEqual()
    stringEqual()
    println("isTextEqual = ${isTextEqual("a", "a")}")
}


fun intEqual() {
    val int127First = 127
    val int127Second = 127
    println("int127First == int127Second :" + (int127First == int127Second))

    val int128First = 128
    val int128Second = 128
    println("int128First == int128Second :" + (int128First == int128Second))

}

fun stringEqual() {
    val strBuilder1 = StringBuilder("IT互联网大叔").toString()
    val strBuilder2 = StringBuilder("IT互联网大叔").toString()
    println("strBuilder1 == strBuilder2 :" + (strBuilder1 == strBuilder2))


    val str1 = "IT互联网大叔"
    val str2 = "IT互联网大叔"
    println("str1 == str2 :" + (str1 == str2))
}

/**
 * 判断字符串是否相等
 */
fun isTextEqual(str1: String?, str2: String?): Boolean {
    return str1 == str2
}