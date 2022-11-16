package Taller_2

import kotlin.math.ceil

/* Modelaje de la funcion
Entradas
*Estudiantes --> Int --> capacidad_salon --> Int --> n_salones_x_piso
Salidas
! Pair<Int,Int>
 */

//funcion
fun universidad(estudiantes: Int, capacidad_salon:Int,n_salones_x_piso:Int):Pair<Int,Int>{
    val estudiantes = estudiantes.toDouble()
    val capacidad_salon = capacidad_salon.toDouble()
    val cantidad_salones = ceil(estudiantes/capacidad_salon)
    val cant_pisos = cantidad_salones/n_salones_x_piso
    return Pair(cantidad_salones.toInt(),cant_pisos.toInt())
}

//programa
fun main(){
    val estudiantes = 250
    val capacidad_salon = 12
    val n_salones_x_piso = 7
    val universidad = universidad(estudiantes,capacidad_salon,n_salones_x_piso)
    print("El nuevo edificio tendra ${universidad.first} salones y ${universidad.second} pisos")
}