package Corte_1

/* Modelaje de la funcion
Entradas
* nota1 --> Int ---> nota2 --> Int --> nota3
Salidas
! final --> Double
 */

//funcion
fun nota_final(nota1:Int,nota2:Int,nota3:Int):Double{
    val final = (nota1*0.25) + (nota2*0.25) + (nota3*0.50)
    return final
}

//programa
fun main(){
    println("Ingresa la primera nota de (0 - 100):")
    val nota1 = readLine()!!.toInt()
    println("Ingresa la segunda nota de (0 - 100):")
    val nota2 = readLine()!!.toInt()
    println("Ingresa la tercera nota de (0 - 100):")
    val nota3 = readLine()!!.toInt()

    println("La nota final fue de ${nota_final(nota1,nota2,nota3)}")
}