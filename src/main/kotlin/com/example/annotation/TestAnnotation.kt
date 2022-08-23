package com.example.annotation

annotation class TestAnnotation(val value: String)

class Application {
    @TestAnnotation("JUNE")
    fun sayHello() {
        println("Hello")
    }
}

fun main() {
    val methods = Application::class.java!!.methods
    for (method in methods) {
        if (method.isAnnotationPresent(TestAnnotation::class.java)) {
            val annotation = method.getAnnotation(TestAnnotation::class.java)
            println(annotation.value)
        }
    }
}