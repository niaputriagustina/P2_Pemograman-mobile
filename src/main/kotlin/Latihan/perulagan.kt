package Latihan

fun main() {
    print("versi for hitungan mundur")
    print( " === " )

    for
            (i in 20 downTo 0) {
        print("$i")
    }
    println()

    print ( "versi for step 3" )
    print ( " === " )

    for
            (i in 3 .. 30 step 3){
        print("$i")
    }

}