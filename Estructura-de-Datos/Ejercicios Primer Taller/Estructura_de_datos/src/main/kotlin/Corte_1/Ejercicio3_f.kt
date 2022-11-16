package Corte_1

/* Modelaje de la funcion
Entradas
* h_entrada --> Int --> min_entrada
* h_salida --> Int --> min_salida
* valor_hora --> Int
Salidas
! total --> Int
 */

//funcion
fun cobro(h_entrada:Int, min_entrada:Int, h_salida:Int,min_salida:Int, valor_hora:Int): Int {
    val horas = h_salida - h_entrada
     val total = if (min_salida > min_entrada){
         val monto = horas + 1
         val total = monto * valor_hora
         return total
     }else{
         return horas * valor_hora
     }
    return total
}

//programa
fun main(){
    println("Ingrese la hora de entrada, formato 24hrs: ")
    val h_entrada = readLine()!!.toInt()
    println("Ingrese el minuto de entrada, entre (0 - 60): ")
    val min_entrada = readLine()!!.toInt()
    println("Indique la hora de salida, formato 24hrs: ")
    val h_salida = readLine()!!.toInt()
    println("Indique el minuto de salida, entre (0 - 60): ")
    val min_salida = readLine()!!.toInt()
    println("Indique el valor a pagar por hora: ")
    val valor_hora = readLine()!!.toInt()
    println("Se debe cobrar: ${cobro(h_entrada,min_entrada,h_salida,min_salida, valor_hora)} pesos")
}