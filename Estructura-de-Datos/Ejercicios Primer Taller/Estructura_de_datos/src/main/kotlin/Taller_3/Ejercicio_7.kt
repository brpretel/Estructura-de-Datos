package Taller_3

//funcion
fun numsDivisores(numero:Int):Int{

    var contarNum = 0
    for (i in 1 ..numero+1) {
        if (numero%i==0) {
            contarNum++
        }
    }
    return contarNum
}

//programa
fun main(){

    println("Ingrese el número entero para saber la cantidad de divisores que tiene")
    var numero= readLine()!!.toInt()
    println("Los divisores son: ${numsDivisores(numero)}")
}