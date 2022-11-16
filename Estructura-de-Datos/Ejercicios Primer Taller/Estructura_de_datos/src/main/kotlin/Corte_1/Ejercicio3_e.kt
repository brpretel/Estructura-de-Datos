package Corte_1

/* Modelaje de la funcion
Entradas
* año --> Int
Salidas
! edad --> Int
 */

//funcion
fun edad(año: Int):Int{
    val edad = 2022 - año
    return edad
}

//programa
fun main(){
    println("Indique el año en que nacio: ")
    val año = readLine()!!.toInt()
    println("El trabajador tiene: ${edad(año)} años ")
}