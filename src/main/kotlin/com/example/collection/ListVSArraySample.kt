package com.example.collection

import java.util.*


fun main() {
    val list = listOf<Number>(1, 2, 3)
    list.plus(4)
    println(list.size)

//    val longList = listOf<Int>(1L, 2L, 3L) // error
//    println(list.size)

    val array = arrayOf<Number>(1, 2, 3)
    array[3] = 4 // error
    println(array.size)

    // arrayListOf == mutableListOf
    val arrayList = arrayListOf<Number>(1, 2, 3)
    val mutableList = mutableListOf<Number>(1, 2, 3)
    arrayList.add(4)
    println(arrayList.size)

    // linkedListOf has been deprecated and is not available now
    val linkedList = LinkedList(listOf(1, 2))
}

