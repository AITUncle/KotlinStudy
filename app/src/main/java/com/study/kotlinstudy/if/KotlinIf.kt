package com.study.kotlinstudy.`if`


fun main() {

    max(10, 11)

}

//fun max(a:Int, b:Int):Int{
//    val max =  if (a > b){
//        print("a is bigger")
//        a
//    } else if(a == b){
//        print(" a == b")
//        a
//    }else {
//        print("b is bigger")
//        b
//    }
//    return max
//}

fun max(a:Int, b:Int):Int{
    val max = when {
        a > b -> {
            print("a is bigger")
            a
        }
        a == b -> {
            print(" a == b")
            a
        }
        else -> {
            print("b is bigger")
            b
        }
    }
    return max
}