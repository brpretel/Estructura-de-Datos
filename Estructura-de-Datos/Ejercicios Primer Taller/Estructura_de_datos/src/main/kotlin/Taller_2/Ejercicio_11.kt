package Taller_2

import kotlin.math.floor

/* Modelaje de las funciones
Entradas
*numero --> Int
Salidas
! Pair --> <Int,Int>
! romano --> String
 */

//funciones
fun decenaUnidad(numero:Int):Pair<Int,Int>{
    var unidad=numero%10
    var decena= floor(numero/10.0)
    return Pair(decena.toInt(),unidad)
}

fun romanoUnidad(numero: Int):String{
    require(numero in 0..9 )
    var romano=""
    romano = when(numero){
        1-> "I"
        2-> "II"
        3-> "III"
        4-> "IV"
        5-> "V"
        6-> "VI"
        7-> "VII"
        8-> "VIII"
        9-> "IX"
        else-> ""
    }
    return romano
}

fun romanoDecena(numero: Int):String{
    require(numero in 0..9 )
    var romano=""
    romano = when(numero){
        1-> "X"
        2-> "XX"
        3-> "XXX"
        4-> "XL"
        5-> "L"
        6-> "LX"
        7-> "LXX"
        8-> "LXXX"
        9-> "XC"
        else-> ""
    }
    return romano
}

//Programa
fun main () {
    print("Digite numero: ")
    var numero = readln()!!.toInt()
    if (numero >=0 && numero <= 99) {
        var unidad = decenaUnidad(numero).second
        var decena = decenaUnidad(numero).first
        var romanoU = romanoUnidad(unidad)
        var romanoD = romanoDecena(decena)
        println("${romanoD}${romanoU}")
    } else {
        println("El numero debe ser menor a 100")
    }
}