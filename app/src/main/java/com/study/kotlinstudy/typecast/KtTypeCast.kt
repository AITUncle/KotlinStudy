package com.study.kotlinstudy.typecast

import java.io.Closeable
import java.io.IOException
import java.util.*

@Throws(IOException::class)
fun close(obj: Any) {

    if (obj is Closeable) {
        obj.close()//obj已经是一个Closeable类型了
    }

    if (obj is String && obj.length > 0) {
        println("not empty")
    }
}

fun testList(list:List<String>){
    if(list is LinkedList && list.isNotEmpty()){
        val trimLast = list.last.trim()
        println(trimLast)
    }
    //...
}

fun testList2(list:List<Readable>){
    UByte
    //...
}

fun main() {
    val list = LinkedList<String>()
    list.add("1")
    testList(list)
}