package me.buhuan.kotline.exmaple

//fun maxOf(a: Int, b: Int): Int {
//	if (a > b) {
//		return a
//	} else {
//		return b
//	}
//}
// 使用条件表达， 类似于Haskell的模式匹配
fun maxOf(a: Int, b: Int) = if (a > b) a else b



fun select(a: String) = when (a) {
	"1" -> println(a)
	else -> {
		println("error")
	}
}
