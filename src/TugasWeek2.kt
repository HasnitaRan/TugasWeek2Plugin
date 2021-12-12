fun main(){
    val angka : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val a = angka.filter {it > 5}
    val b = a.filter{it %2 == 0}

    println(b)
}