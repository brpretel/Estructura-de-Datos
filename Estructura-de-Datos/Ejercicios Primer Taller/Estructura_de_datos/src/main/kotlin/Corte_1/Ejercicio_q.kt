package Corte_1

/* Modelaje de la funcion
Entradas
* c --> Int --> t
* n --> Double
Salidas
! vp --> Int
 */

//funcion
fun valor_presente(c:Int, n:Double, t:Int):Int{
    val vp = c/Math.pow(1+t.toDouble(),n)
    return vp.toInt()
}

//funcion
fun main(){
    println("Ingrese la cantidad de capital:")
    val c = readLine()!!.toInt()
    println("Ingrese la tasa de interes")
    val t = readLine()!!.toInt()
    println("Ingrese la cantidad de años")
    val n = readLine()!!.toDouble()
    println("El valor presente tiene un total de: ${valor_presente(c,n,t)}")
}