package Taller_5

fun verbos(list:MutableList<String>):Int{
    var contador = 0

    for(verbo in list){
        var minuscula = verbo.lowercase()
        if(minuscula.endsWith("ar")|| minuscula.endsWith("er")|| minuscula.endsWith("ir")|| minuscula.endsWith("ur")){
            contador++
        }
    }
    return contador
}

fun main(){
    var num : Int
    println("Cuantas palabras desea ingresar:")
    num = readLine()!!.toInt()
    var lista:MutableList<String> = mutableListOf()
    repeat(num){
        println("Ingrese la palabra")
        var palabra = readLine()!!.toString()
        lista.add(palabra)
    }
    println("Del numero de palabras ${num} los verbos son ${verbos(lista)}")
}