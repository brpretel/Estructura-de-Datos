package Taller_2

/* Modelaje de la funcion
Entradas
*x --> Int -->y
Salidas
! valor --> Int
 */

//funcion
fun algeb(x:Int,y:Int):Int{
    val x = x.toDouble()
    val y = y.toDouble()
    val valor= Math.pow(x,2.0)-2*(x*y)+Math.pow(y,2.0)
    return valor.toInt()
}

//programa
fun main(){
    println(algeb(1,5))
}