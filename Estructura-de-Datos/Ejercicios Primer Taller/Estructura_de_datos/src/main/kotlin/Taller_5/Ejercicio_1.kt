package Taller_5

fun siglo_pasado(list: MutableList<Int>):Pair<Int,Double>{
    var siglo_p = 0
    var suma = 0.0

    for(edad in list){
        if (edad > 23){
            siglo_p ++
        }
        suma += edad
    }
    var promedio = suma/list.size
    return Pair(siglo_p,promedio)
}

fun main(){
    var lista: MutableList<Int> = mutableListOf()
    println("Ingrese un edad:")
    var edad = readLine()!!.toInt()

    while(edad>0){
        lista.add(edad)
        println("Ingrese un edad:")
        edad = readLine()!!.toInt()
    }

    val uno = siglo_pasado(lista).first
    val dos = siglo_pasado(lista).second
    println(lista)
    println("Un total de ${uno} nacieron el siglo pasado para un promedio de edad de: ${dos}")
}