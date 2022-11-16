package Corte_1

/* Modelaje de la funcion
Entradas
* x --> Int
Salidas
! total --> Int
 */

//funcion
fun desempleados (x: Int):Int {
    val total = x*8.15/100
    return total.toInt()
}

//programa
fun main() {

    println("Por favor ingrese el numero de personas en Colombia: ")
    val x = readLine()!!.toInt()

    println("El numero de desempleados en colombia es : "+ desempleados(x))
}