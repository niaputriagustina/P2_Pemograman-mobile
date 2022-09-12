fun main(){
    println("masukan nama lengkap")
    var nama :String?= readLine()
    println("masukan bilangan 1")
    val bil1 : Int= readLine()!!.toInt()
    println("masukan bilangan 2")
    val bil2: Int= readLine()!!.toInt()

    println("operasi penjumlahan :"+ (bil1+bil2))
    println("operasi penjumlahan :"+ (bil1-bil2))
    println("operasi penjumlahan :"+ (bil1*bil2))
    println("operasi penjumlahan :"+ (bil1/bil2))
}