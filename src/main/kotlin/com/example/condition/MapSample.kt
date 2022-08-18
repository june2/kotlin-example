package com.example.condition


fun main(args: Array<String>) {
    val map = mutableMapOf<String, String>()
    map["key"] = "value"

    map["key"]?.run {
        println("not null")
    } ?: run {
        println("null")
    }
}