package Taller_3

//programa
fun main() {

    print("Digite número entero positivo a multiplicar")
    var numero = readLine()!!.toInt()
    var i = 0
    println("Tabla de multiplicar del $numero")
    repeat(11) {
        //for (it in 1..10)
        //if (it>0)
        //println("$numero x $i = ${numero*i}")
        //i++
        println("$numero x $it = ${numero * it}")
    }
}