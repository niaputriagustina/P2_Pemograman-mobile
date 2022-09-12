package Latihan

fun main() {
    println("masukkan nilai 1 :")
    val n1: Double = readLine()!!.toDouble()
    println("masukkan nilai 2 :")
    val n2: Double = readLine()!!.toDouble()
    println("masukkan nilai 3 :")
    val n3: Double = readLine()!!.toDouble()


    println("masukkan opsi")
    val opsi= readLine()


    when (opsi){

        "A" -> println("operasi penjumlahan    :" + (n2 + n3))
        "B"-> println("operasi pengurangan     :" + (n3 - n1))
        "C"->println("operasi perkalian        :" + (n2 * n3))
        "D"-> println("operasi pembagian       :" + (n1 / n3))
    }

}