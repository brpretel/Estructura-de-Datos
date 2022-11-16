package Taller_2

/* Modelaje de la funcion
Entradas
*x1 --> Int --> x2 --> Int --> y1 --> Int --> y2
Salidas
! d --> Double
! pendiente --> Int
! xm+ym --> Int
 */

//funcion
fun distancia_puntos(x1:Int,x2:Int,y1:Int,y2:Int):Double{
    val x1 = x1.toDouble()
    val x2 = x2.toDouble()
    val y1 = y1.toDouble()
    val y2 = y2.toDouble()
    val d = Math.sqrt(Math.pow(y2-y1,2.0)+ Math.pow(x2-x1,2.0))
    return d
}

fun pendiente(x1:Int,x2:Int,y1:Int,y2:Int):Int{
    val pendiente = (y2-y1)/(x2-x1)
    return pendiente
}

fun punto_medio(x1:Int,x2:Int,y1:Int,y2:Int):Int{
    val xm = (x1+x2)/2
    val ym = (y1+y2)/2
    return xm+ym
}

//programa
fun main(){
    val x1 = 1
    val x2 = 3
    val y1 = 2
    val y2 = 4

    println("La distancia entre los puntos es de ${distancia_puntos(x1,x2,y1,y2)}")
    println("La pendiente de la recta es de ${pendiente(x1,x2,y1,y2)}")
    println("El punto medio es de ${punto_medio(x1,x2,y1,y2)}")
}