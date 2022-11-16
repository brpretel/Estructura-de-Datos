package Taller_5

fun altura(list: MutableList<Double>, alto:Int):Pair<Int,Double>{
    var contador = 0
    var sumas = 0.0
    val alto = alto.toDouble()
    for(alturas in list){
        if (alturas < alto){
            contador ++
            sumas += alturas
        }
    }
    var promedios = sumas/list.size
    return Pair(contador,promedios)
}


fun main(){
    var listas: MutableList<Double> = mutableListOf()
    println("Ingrese una altura:")
    var altura = readLine()!!.toDouble()

    while(altura>0){
        listas.add(altura)
        println("Ingrese una altura:")
        altura = readLine()!!.toDouble()
    }
    println("Ingrese un numero entero:")
    val numero = readLine()!!.toInt()

    val unos = altura(listas,numero).first
    val doss = altura(listas,numero).second
    println(listas)
    println("Un total de ${unos} se encuentran por debajo de: ${numero}")
    println("La altura promedio es de: ${doss}")
}