package Taller_2

import kotlin.math.sin

/* Modelaje de la funcion
Entradas
*x --> Int  --> angulo
Salidas
! longitud --> Int
 */

//funcion
fun escalera(x:Int,angulo:Int):Int{
    val angulo = angulo.toDouble()*(Math.PI/180)
    val longitud = x/ sin(angulo)
    return longitud.toInt()
}

//programa
fun main(){

    println("La longitud de la escalera es de: ${escalera(50,45)} cm")
}