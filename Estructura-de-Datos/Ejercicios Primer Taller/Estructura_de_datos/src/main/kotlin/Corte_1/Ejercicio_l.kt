package Corte_1

/* Modelaje de la funcion
Entradas
* edad --> Int --> promedio
Salidas
! mensaje --> Any
 */

//funcion
fun becas(edad: Int, promedio: Int): Any {
    val beca1 = "$2000.00"
    val beca2 = "$1000.00"
    val beca3 = "$500.00"
    val beca4 = "$3000"
    val beca5 = "$2000"
    val beca6 = "$100"
    val mensaje1 = "No ganaste ninguna BECA, debes seguir estudiando , mantente motivado!"
    val mensaje2 = "Haz ganado una BECA por un valor de"

    val mensaje = if (edad>18 ){
        if (promedio>=90){
            return Pair(mensaje2,beca1)
        }else if (promedio>=75){
            return Pair(mensaje2,beca2)
        }else if (promedio<75 && promedio>=60){
            return Pair(mensaje2,beca3)
        }else{
            println(mensaje1)
        }
    }else{
        if(promedio>=90){
            return Pair(mensaje2,beca4)
        }else if (promedio<90 && promedio>=80){
            return Pair(mensaje2,beca5)
        }else if (promedio<80 && promedio>=60){
            return Pair(mensaje2,beca6)
        }else{
            return mensaje1
        }
    }
    return mensaje
}

//programa
fun main(){
    println("Indique la edad del alumno:")
    val edad= readLine()!!.toInt()
    println("Indique el promedio del alumno:")
    val promedio= readLine()!!.toInt()
    println(becas(edad,promedio))
}