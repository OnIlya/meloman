package ru.netology

import java.util.*

fun main() {

    val meloman = true
    val scanner = Scanner(System.`in`)

    while (true) {
        val purchaseAmount = scanner.nextDouble()
        if (purchaseAmount in 1000.00..10_000.00) {
            println(purchaseAmount - 100)
        } else if (purchaseAmount > 10_001) {
            println(purchaseAmount - ((purchaseAmount * 5) / 100))
        } else {
            println(purchaseAmount)
        }
        break
    }
    while (meloman) {
        val purchaseAmount = scanner.nextDouble()
        if (purchaseAmount in 1000.00..10_000.00) {
            println((purchaseAmount - 100) - (purchaseAmount - 100)/100)
        } else if (purchaseAmount > 10_001) {
            println((purchaseAmount - ((purchaseAmount * 5) / 100))
                    - ((purchaseAmount - ((purchaseAmount * 5) / 100)) / 100))
        } else {
            println(purchaseAmount - (purchaseAmount / 100))
        }
        break
    }

}






