package com.example.collection

class Person(
    private val id: Long,
    private val name: String,
    private val age: Int
) {
    fun getName(): String {
        return this.name
    }
}

fun main(args: Array<String>) {
    val list = mutableListOf<Person>(Person(1, "June", 30), Person(2, "June", 30))
    val nameList = list.map { it.getName() }
}