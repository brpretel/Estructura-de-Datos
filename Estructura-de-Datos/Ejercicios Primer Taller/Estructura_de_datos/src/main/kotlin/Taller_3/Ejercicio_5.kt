package Taller_3

//funcion
fun suma(n:Int):Int{
    var suma = 0
    for(i in 1..n){
        print("Iteracion ${i}, suma parcial de ${suma}+${i} = ")
        suma+=i
        println(suma)
    }
    return suma
}

//programa
fun main(){
    val n = readln().toInt()
    println(suma(n))
}