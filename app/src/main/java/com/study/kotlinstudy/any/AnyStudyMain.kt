package com.study.kotlinstudy.any

fun main() {
    val anyObj = Any()
    val obj = anyObj as Object
    synchronized(obj) {
        obj.wait(100)
    }
    println("anyObj:$anyObj ; obj:$obj")
    println("---------------------------------")
    println("anyObjClass:${anyObj.`class`} ; objClass:${obj.`class`}")
}