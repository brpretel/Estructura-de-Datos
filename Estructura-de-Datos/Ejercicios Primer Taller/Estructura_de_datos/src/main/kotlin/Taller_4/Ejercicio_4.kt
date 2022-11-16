package Taller_4

fun distancia(l:Int,h:Int):Int{
    return l*2+h*2
}


fun main(){
    println("Cuantas ciudades va a ingresar")
    val reps = readLine()!!.toInt()
    var i = 0


    var lista: MutableList<Pair<String,Int>> = mutableListOf()
    var ciudad: String
    var l: Int
    var h : Int
    var dist:Int

    while (i != reps){
        println("Ingrese la ciudad")
        ciudad = readLine()!!.toString()
        println("Ingrese la latitud de la ciudad")
        l = readLine()!!.toInt()
        println("Ingrese la longitud de la ciudad")
        h = readLine()!!.toInt()
        dist = distancia(l,h)
        lista.add(Pair(ciudad,dist))
        i++
    }

    var lista_distancias: MutableList<Int> = mutableListOf()
    var max_dist :Int
    for((ciudad,dist )in lista){
        lista_distancias.add(dist)
    }
    max_dist = lista_distancias.max()

    for((ciudad,dist )in lista){
        if (dist == max_dist){
            println("La ciudad mas lejana es ${ciudad} con distancia de ${dist}")
        }
    }
}