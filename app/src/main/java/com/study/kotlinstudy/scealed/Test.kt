package com.study.kotlinstudy.scealed

class Test : Const(100.0)


fun eval(expr: Expr): Double {
    return when (expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
        NotANumber -> 0.0
    }
}

fun main() {
    val expr = Const(1.0)
    val expr2 = Sum(expr, expr)
    val test = Test()
    println("expr -> ${eval(expr2)} ${eval(test)}")
}