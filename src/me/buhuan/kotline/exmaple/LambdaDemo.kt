package me.buhuan.kotline.exmaple

import java.util.concurrent.locks.Lock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}



fun main(args: Array<String>) {
	val list = arrayOf(1, 2, 3, 4)
	var sum = list.filter { it > 3 }.sum()

	println(sum)
}
