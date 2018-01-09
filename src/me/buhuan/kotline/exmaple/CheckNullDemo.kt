package me.buhuan.kotline.exmaple

fun parseInt(str: String): Int? {
	return try {
		str.toInt()
	} catch (e: NumberFormatException) {
		null
	}

}

fun main(args: Array<String>) {
	println(parseInt("1"))
	println(parseInt("a"))
}
