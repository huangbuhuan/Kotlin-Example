package me.buhuan.kotline.exmaple

fun main(args: Array<String>) {
	val list = arrayOf(1, 2, 3, 4)
	var sum = list.filter { it > 3 }.sum()

	println(sum)
}
