package com.study.kotlinstudy.destructuring

/**
 * 解构申明：
 * 1）map遍历
 * 2）函数返回多个值
 */




fun main() {
    val (myName, myAge) = getFirstPeople()//返回值为People，我们可以直接把返回值结构
    println("my name is $myName, i am $myAge")
}

fun getFirstPeople() = People("IT互联网大叔", 18u)


//class People() {
//    private lateinit var name: String
//    private var age: Int = 0
//
//    constructor(name: String, age: Int) : this() {
//        this.name = name
//        if (age > 0) {
//            this.age = age
//        } else {
//            println("illegal age $age")
//        }
//    }
//
//    operator fun component1() = name
//    operator fun component2() = age
//}

class People(val name: String, val age:UByte) {

    operator fun component1() = name
    operator fun component2() = age
}



fun test(){
    val people = People("IT互联网大叔", 18u)
    var (myName, myAge) = people//注意这行代码，解构申明
    println("my name is $myName, i am $myAge")
}




//fun mapList(){
//    //1) 解构申明，map遍历
//    val map = mapOf("one" to 1, "tow" to 2)
//
//    for ((key, value) in map) {
//        println("$key->$value")
//    }
//}

