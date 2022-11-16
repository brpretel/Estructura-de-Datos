package Taller_4

//Funcion
fun mayorAltura(lista:MutableList<Double>):Double{

    var masAlto:Double = 0.0
    for (altura in lista){
        if (altura>masAlto){
            masAlto = altura.toDouble()

        }
    }
    return masAlto
}

//Programa
fun main(){
    var lista:MutableList<Double> = mutableListOf()
    var altura:Double
    var masAlto:Double = 0.0

    println("Cantidad de estudiantes para tomar la altura:")
    var n:Int = readln()!!.toInt()

    repeat (n ){
        println("Ingresa la altura del estudiante: ${it +1}")
        altura= readln()!!.toDouble()
        lista.add(altura)
        masAlto = mayorAltura(lista)

    }
    print("La altura mayor entre las ingresadas es de: ${masAlto} ")
}