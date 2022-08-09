package com.example.enum

enum class PaymentStatus(val label: String) {
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

    abstract fun isPayable(): Boolean
}

fun main(args: Array<String>) {
    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }
}