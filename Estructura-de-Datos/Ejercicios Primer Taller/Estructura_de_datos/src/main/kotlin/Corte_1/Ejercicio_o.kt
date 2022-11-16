package Corte_1

/* Modelaje de la funcion
Entradas
* cant_personas --> Int
Salidas
! lts_contaminados --> Int
 */

//funcion
fun contaminacion(cant_personas: Int):Int{
    val cant_baterias = cant_personas * 4
    val lts_contaminados = cant_baterias * 175
    return lts_contaminados
}

//programa
fun main(){
    println("Cuantas personas hay en la ciudad?")
    val cant_personas = readLine()!!.toInt()
    println("${cant_personas} personas, contaminaran ${contaminacion(cant_personas)} litros de agua en un año")
}