package Percabangan

fun main() {
    println("masukan nilai uas anda")
    val uts: Int = readLine()!!.toInt()

    println("masukan nilai anda")
    val  uas: Int = readLine()!!.toInt()

    val  na: Double = (0.4 * uts) + (0.6 * uas)
    println(na)

    if(na > 80) {
        print("ANDA NAIK SEMESTER")
    }else {
        println("CUTI BERSAMA")
    }

}