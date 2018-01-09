package me.buhuan.kotline.exmaple

fun main(args: Array<String>) {
	var a: String? = "abc"
	a = null
	val length = a?.length
	println(length)
}
