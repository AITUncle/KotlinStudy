package com.study.kotlinstudy.use

import java.io.File
import java.io.IOException

class KotlinFileUtil {

    fun readFileContent(file: File): String? {
        var firstLine: String? = null
        try {
            file.bufferedReader().use {
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