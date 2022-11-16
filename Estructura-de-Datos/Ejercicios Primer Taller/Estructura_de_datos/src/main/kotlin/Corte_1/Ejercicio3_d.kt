package Corte_1

import kotlin.math.roundToInt

/* Modelaje de la funcion
Entradas
* pesos --> Int --> precio_dolar
Salidas
! total --> Int
 */

//funcion
fun dolares(pesos:Int, precio_dolar:Double): Int {
    val total = pesos/precio_dolar
    return total.roundToInt()
}

//programa
fun main(){
    println("Cuantos pesos Tienes?")
    val pesos = readLine()!!.toInt()
    println("Indique El precio del dolar")
    val precio_dolar = readLine()!!.toDouble()

    println("Usted puede adquirir: ${dolares(pesos,precio_dolar)} dolares")
}