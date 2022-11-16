package Taller_3

//funcion
fun sumaDivisores(numero:Int):Int {
    var suma = 0
    for(i in 1..numero-1){
        if(numero % i ==0)
            suma +=i
        }
    return suma
    }


//programa
fun main(){

    println("Ingrese el numero entero a dividir: ")
    var numero= readLine()!!.toInt()
    println("La suma total de los divisores resultantes es de:${sumaDivisores(numero)}")
}