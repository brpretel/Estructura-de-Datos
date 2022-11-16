package Taller_3

//funcion
fun perfectos(numero:Int):Boolean {
    var suma = 0
    var verif = false
    for(i in 1..numero-1){
        if(numero % i ==0)
            suma +=i
        verif = suma == numero
    }
    return verif
}


//programa
fun main(){
    var contador = 0
    println("Ingrese el numero entero a dividir: ")
    var numero= readLine()!!.toInt()

    for (i in 1 .. numero){
        if (perfectos(i) == true){
            println("${i} es un numero perfecto")
            contador +=1
        }
    }
    println("Hay una cantidad de ${contador} , entre el 1 y el ${numero}")
}