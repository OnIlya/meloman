package ru.netology

fun main() {

    val meloman = true
    val amount = 3000
    val lastPurchase = 500
    val commissionMeloman = amount * 0.01
    val discount = when(lastPurchase) {
        in 0..1000 -> if (meloman) {
            amount - commissionMeloman
        } else {
            amount
        }
        in 1001..10000 -> if (meloman) {
            (amount - 100) - (commissionMeloman - 1)
        } else {
            amount - 100
        }
        else -> if (meloman) {
            amount * 0.95 - commissionMeloman * 0.95
        } else {
            amount - amount * 0.05
        }
    }
    println(discount.toInt())

}






