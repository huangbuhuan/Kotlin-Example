package me.buhuan.kotline.exmaple


// val只读变量
val a: Int = 1
val b = 2
// 报错
// val c: Int = 0
// c = 3
val PI = 3.14
var x = 5
// 报错x += 1
fun incrementX() {
	x += 1
}

fun main(args: Array<String>){
	incrementX()
}
