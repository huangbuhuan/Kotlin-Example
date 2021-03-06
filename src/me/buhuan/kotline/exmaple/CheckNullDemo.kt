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

	val listWithNulls: List<String?> = listOf("A", "B", null)
	for (item in listWithNulls) {
		item?.let { println(it) }
	}
	var b = arrayOf("a", "b")
	val l: Int = b?.size
	var person = Person(null)
	val s = person.name ?: throw IllegalArgumentException("Name is null")
}

data class Person(val name: String ?)
