package Taller_2

/* Modelaje de las funciones
Entradas
*r --> Double
*r --> Double -->R
Salidas
! r-A_R || A_R - r --> Double
 */

//funcions
fun area_r(r:Double):Double{
    val A_r = Math.PI*(Math.pow(r,2.0))
    return A_r
}

fun area_R(r:Double,R:Double):Double{
    val A_R = Math.PI*(Math.pow(R,2.0))
    if (r>R){
        return r-A_R
    }else{
        return A_R-r
    }
}

//programa
fun main(){
    println("Indique el radio del Primer Circulo")
    val r = readln()!!.toDouble()
    println("Indique el radio del Segundo Circulo")
    val R = readln()!!.toDouble()
    println("El area de la corona circular es: ${area_R(area_r(r),R)}")
}