package com.study.kotlinstudy.string


class A {
    fun foo(i: Int = 10) { /*……*/ }
}


fun main() {
    print(PeopleJava("IT互联网大叔", 18).toString())
    println()
    print(PeopleKt("IT互联网大叔", 18).toString())
    A().foo()
}