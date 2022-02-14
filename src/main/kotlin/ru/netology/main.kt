package ru.netology

import java.util.*

fun main() {

    val meloman = true
    val amount = 20_000
    val lastPurchase = 20_000.00
    val discount = when(lastPurchase) {
        in 0.00..1000.00 -> if (meloman) {
            amount - amount * 0.01
        } else {
            amount
        }
        in 1001.00..10000.00 -> if (meloman) {
            (amount - 100.00) - (amount - 100.00) * 0.01
        } else {
            amount - 100.00
        }
        else -> if (meloman) {
            (amount - amount * 0.05) - (amount * 0.95) * 0.01
        } else {
            amount - amount * 0.05
        }
    }
    println(discount)

}






