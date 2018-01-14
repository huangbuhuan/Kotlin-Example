package me.buhuan.kotline.exmaple

//fun sum(a: Int, b: Int): Int {
//	return a + b
//}
fun sum(a: Int, b: Int) = a + b

//fun printSum(a: Int, b: Int): Unit {
//	println("sum of $a and $b is ${a + b}")
//}
fun printSum(a: Int, b: Int) {
	println("sum of $a and $b is ${a + b}")
}

fun foo(a: Int = 0, b: Int,  qux: () -> Unit) {

}

tailrec fun findFixPoint(x: Double = 1.0): Double =
		if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun main(args: Array<String>) {
	foo(1, 2) { println("hello") }
}

