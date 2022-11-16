package Corte_1

/* Modelaje de la funcion
Entradas
* valor_m2 --> Int --> cant_m2
Salidas
! total --> Int
 */

//funcion
fun cobro(valor_m2:Int,cant_m2: Int): Int{
    val total = cant_m2 * valor_m2
    return  total
}

//programa
fun main(){
    println("Indique el valor del m2:")
    val valor_m2 = readLine()!!.toInt()
    println("Indique la cantidad de m2 que se pintaran:")
    val cant_m2 = readLine()!!.toInt()
    println("Se debe cobrar un total de ${cobro(valor_m2,cant_m2)} pesos, para un trabajo de ${cant_m2}m2, a un precio de ${valor_m2} por m2")
}