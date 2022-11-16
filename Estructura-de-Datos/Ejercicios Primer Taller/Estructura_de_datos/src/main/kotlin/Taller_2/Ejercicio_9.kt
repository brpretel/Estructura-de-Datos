package Taller_2

/* Modelaje de la funcion
Entradas
*a --> Int --> b --> Int
Salidas
! a || b -->Int
 */

//funcion
fun mayor(a:Int,b:Int):Int{
    if (a>b){
        return a
    }else{
        return b
    }
}

//programa
fun main(){
    val a = 80
    val b = 40
    print("El mayor de los numeros es: ${mayor(a,b)}")
}