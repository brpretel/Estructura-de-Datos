package Corte_1

/* Modelaje de la funcion
Entradas
* velocidad --> Int --> distancia
Salidas
! tiempo --> Double
 */

//funcion
fun tiempo_viaje(velocidad: Int, distancia: Int):Double{
    val tiempo = distancia/velocidad.toDouble()
    return  tiempo
}

//programa
fun main(){
    println("Ingrese la cantidad de km de recorrido:")
    val distancia = readLine()!!.toInt()
    println("Indique a que km de velocidad ira:")
    val velocidad = readLine()!!.toInt()
    println("Le tomara ${tiempo_viaje(velocidad,distancia)} horas en realizar el recorrido")
}