package com.study.kotlinstudy.use

import java.io.File
import java.io.IOException

class KotlinFileUtil {

    fun readFileContent(file: File): String? {
        var firstLine: String? = null
        try {
            file.bufferedReader().use {
                //use函数执行完只有将自动关闭CloseAble，所以不需要主动close。
                firstLine = it.readLine()
            }
        }catch (e:IOException){
            e.printStackTrace()
        }

        return firstLine
    }
}


fun main() {
    val logFile = File("/Users/vectorzeng/develop/python/csdn_read/text.log")
    val firstLineFromJava = KotlinFileUtil().readFileContent(logFile)
    val firstLineFromKotlin = JavaFileUtil.readFileFirstLine(logFile)
    println("firstLineFromJava=$firstLineFromJava")
    println("firstLineFromKotlin=$firstLineFromKotlin")
}