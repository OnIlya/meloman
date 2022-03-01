package ru.netology

fun main() {

    val meloman = true
    val amount = 5479
    val lastPurchase = 5000
    val discountedAmount = when {
        lastPurchase > 10_000 -> amount * 0.95
        lastPurchase > 1_000 -> amount - 100
        else -> amount
    }
    val melomanAmount = when(meloman) {
        true -> discountedAmount.toDouble() * 0.99
        else -> discountedAmount
    }
    val convertRub = melomanAmount.toDouble() * 100

    println("${melomanAmount.toInt()} руб ${convertRub.toInt() % 100} коп")

}










