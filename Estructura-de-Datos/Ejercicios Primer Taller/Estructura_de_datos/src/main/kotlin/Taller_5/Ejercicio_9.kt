package Taller_5

fun dist_origen(x:Double,y:Double):Int{
    return Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0)).toInt()
}

fun cuadrante(x:Double,y:Double):Int{
    if (x>0 && y >0){
        return 1
    }else if(x<0 && y>0){
        return 2
    }else if(x<0 && y<0){
        return 3
    }else if(x>0 && y<0){
        return 4
    }
    return 0
}

fun coords(list:Pair<Double,Double>):Triple<Pair<Double,Double>,Int,Int>{
    val x = list.first
    val y = list.second
    return Triple(Pair(x,y), dist_origen(x,y), cuadrante(x,y))

}
fun main(){
    println("Cuantos puntos va a ingresar?")
    val reps = readLine()!!.toInt()
    var i = 0


    var lista: MutableList<Pair<Double,Double>> = mutableListOf()
    var x: Double
    var y: Double

    while (i != reps){
        println("Ingrese la coordenada x")
        x = readLine()!!.toDouble()
        println("Ingrese la coordenada y")
        y = readLine()!!.toDouble()
        lista.add(Pair(x,y))
        i++
    }

    println("Elementos ${lista}")
    for(elements in lista){
        val one = coords(elements).first
        val two = coords(elements).second
        val tree = coords(elements).third
        println("Punto= ${one}, distancia al origen= ${two}, cuandrante= ${tree} ")
    }
}