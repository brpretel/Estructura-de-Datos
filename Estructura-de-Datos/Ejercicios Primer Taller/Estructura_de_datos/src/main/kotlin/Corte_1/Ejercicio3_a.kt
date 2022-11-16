package Corte_1

/* Modelaje de la funcion
Entradas
*b --> Int --> a
Salidas
! area -->int
 */

//funcion
fun area_triangulo(b: Int, a:Int):Int{
    val area= b*a/2
    return area
}

//programa
fun main(){
    print("Ingrese el valor de la base: ")
    val b= readLine()!!.toInt()
    print ("Ingrese el valor de la altura: ")
    var a = readLine()!!.toInt()

    println("El area de el triangulo es de : ${area_triangulo(b,a)}")
}