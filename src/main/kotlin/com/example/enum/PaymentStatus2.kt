package com.example.enum

interface Payable {
    fun isPayable(): Boolean
}

enum class PaymentStatus2(val label: String) : Payable {
    UNPAID("미지급") {
        override fun isPayable() = true
    },
    PAID("지급완료") {
        override fun isPayable() = false
    },
    FAILED("지급실패") {
        override fun isPayable() = false
    },
    REFUNDED("환불") {
        override fun isPayable() = false
    };
}

fun main(args: Array<String>) {
    val paymentStatus = PaymentStatus2.valueOf("PAID")
    // 지급완료
    println(paymentStatus.label)
    println()

    // 결제 완료 상태
    if (paymentStatus == PaymentStatus2.PAID) {
        println("결제 완료 상태")
    }
    println()

    for (status in PaymentStatus.values()) {
        println("[$status](${status.label})")
    }
    println()

    // [UNPAID](미지급) : 0
    // [PAID](지급완료) : 1
    // [FAILED](지급실패) : 2
    // [REFUNDED](환불) : 3
    for (status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}