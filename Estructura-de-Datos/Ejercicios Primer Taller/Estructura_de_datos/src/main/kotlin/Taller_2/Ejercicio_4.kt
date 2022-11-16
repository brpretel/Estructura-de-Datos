package Taller_2

/* Modelaje de la funcion
Entradas
*sueldo --> Int
Salidas
! Triple --> <Double,Double,Double>
 */

//funcion
fun pedro(sueldo: Int):Triple<Double,Double,Double>{
    val arriendo = sueldo*0.40
    val comida = sueldo*0.15
    val dinero = sueldo - (arriendo + comida)
    return Triple(arriendo,comida,dinero)
}

//programa
fun main(){
    val arriendo = pedro(50000).first
    val comida = pedro(50000).second
    val dinero = pedro(50000).third
    println(" Dinero gastado en Arriendo= ${arriendo}$\n Dinero gastado en comida = ${comida}\$ \n Le quedan ${dinero}$ Dolares")
}