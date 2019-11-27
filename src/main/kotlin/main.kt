@file:JvmName("Main")
package org.example.broken_test_fixtures

internal fun sayHello(who: String): String = "Hello, $who!"

fun main() {
    println(sayHello("world"))
}
