package me.buhuan.kotline.exmaple

fun foo() {
    val ints = arrayOf(1, 2, 3, 0,  4)
    ints.forEach lit@{
        if (it == 0) return@lit
        println(it)
    }
}

fun main(args: Array<String>) {
    loop@ for(i in 1..100) {
        for(j in 1..100) {
            if(j > 1) break@loop
        }
    }
    foo()
}