package Taller_2

import kotlin.math.ceil

/* Modelaje de la funcion
Entradas
*x_flaco --> Int  --> x_gordo --> sillas --> Int
Salidas
! buses --> Int
 */

//funcion
fun paseo(x_flaco:Int,x_gordo:Int,sillas:Int):Int{
    val sillas = sillas.toDouble()
    val sillas_necesarias= (x_gordo * 2 + x_flaco)
    val buses = ceil(sillas_necesarias / sillas).toInt()
    return buses
}

//programa
fun main(){
    println("Se necesitan ${paseo(5,8,10)} buses para llevar a los estudiantes")
}