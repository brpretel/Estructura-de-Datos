package Corte_1

import java.io.Serializable

/* Modelaje de la funcion
Entradas
* megas_peli --> Int
Salidas
! Triple <Int,Int,Int> or Int
 */

//funcion
fun descarga(megas_peli:Int): Serializable {
    val velocidad = 4
    val tiempo = megas_peli/velocidad

    val hora = tiempo/3600
    val min = tiempo/60
    val sec = if (min>60){
        val secs = min-60
        val min = 60
        val timer = Triple(hora,min,secs)
        val firs = "hours:${timer.first}"
        val second = "minutes:${timer.second}"
        val third = "seconds:${timer.third}"
        return Triple(firs,second,third)
    }else{
        val secs = 0
        val timer = Triple(hora,min,secs)
        val firs = "hours:${timer.first}"
        val second = "minutes:${timer.second}"
        val third = "seconds:${timer.third}"
        return Triple(firs,second,third)
    }
}

//programa
fun main(){
    println("Ingrese la cantidad de megas que pesa la pelicula: ")
    val megas_peli = readLine()!!.toInt()
    println("Tiempo de espera= ${descarga(megas_peli)}")
}