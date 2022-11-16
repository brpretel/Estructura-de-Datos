package Corte_1

/* Modelaje de la funcion
Entradas
* nom1 --> String --> nom2 --> String ---> nom3
* edad1 --> Int --> edad2 --> Int --> edad 3
Salidas
! Map.Entry <nom{} --> String, edad{} --> Int>
 */

//funcion
fun menor(nom1: String, edad1: Int, nom2: String, edad2 : Int, nom3: String, edad3: Int): Map.Entry<String,Int> {
    val lista = mapOf(
        nom1 to edad1,
        nom2 to edad2,
        nom3 to edad3
    )
    return  lista.minWith(compareBy { it.value })
}

//programa
fun main(){
    println("Ingresa el nombre de la primera persona:")
    val nom1 = readLine()!!
    println("Ingresa su edad:")
    val edad1 = readLine()!!.toInt()
    println("Ingresa el nombre de la segunda persona:")
    val nom2 = readLine()!!
    println("Ingresa su edad:")
    val edad2 = readLine()!!.toInt()
    println("Ingresa el nombre de la tercera persona:")
    val nom3 = readLine()!!
    println("Ingresa su edad:")
    val edad3 = readLine()!!.toInt()
    println("El menor es ${menor(nom1,edad1,nom2,edad2,nom3,edad3)}")
}