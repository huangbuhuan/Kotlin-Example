package me.buhuan.kotline.exmaple

fun main(args: Array<String>) {
    loop@ for(i in 1..100) {
        for(j in 1..100) {
            if(j > 1) break@loop
        }
    }
}