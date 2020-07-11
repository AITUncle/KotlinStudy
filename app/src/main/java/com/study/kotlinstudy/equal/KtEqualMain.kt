package com.study.kotlinstudy.equal


/**
 * kotlin 提供了两个相等操作符 == 和 ===
 * == Structural equality【结构相等】，用 equals() 检测。
 *     相当于调用 Object.equals() 方法，并且自动判断了为对象为null情况，无需手动判空处理。
 *     Object类equals 的默认实现，就是引用相等
 *
 * === Referential equality【引用相等】，两个引用是否指向同一对象
 *     相当于java的 ==
 */
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

fun isTextEqual2(str1: String?, str2: String?):Boolean{
    return str1?.equals(str2) ?: (str1 === null)
}

fun isTextEqual3(str1: String?, str2: String?):Boolean{
    if (str1 == null){
        return str2 == null
    }
    return str1?.equals(str2)
}