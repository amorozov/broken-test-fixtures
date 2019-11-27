package org.example.broken_test_fixtures

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SayHelloTest {
    @Test
    fun testSayHello() {
        val expected = "Hello, world!"
        val actual = sayHello("world")
        assertEquals(actual, expected)
    }
}
