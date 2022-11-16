package Taller_4

fun puntos(ganado:Int,empatado:Int):Int{
    var ganado = ganado*3
    return ganado+empatado
}


fun main(){

    println("Cuantos equipos va a ingresar")
    val reps = readLine()!!.toInt()
    var i = 0

    var equipo:String
    var ganados:Int
    var empatados:Int
    var total: Int
    var torneo: MutableList<Pair<String,Int>> = mutableListOf()

    while (i != reps){
        println("Ingrese el nombre del equipo #${i+1}")
        equipo = readLine()!!.toString()
        println("Ingrese los partidos ganados del equipo #${i+1}")
        ganados = readLine()!!.toInt()
        println("Ingrese los partidos empatados del equipo #${i+1}")
        empatados = readLine()!!.toInt()
        total = puntos(ganados,empatados)
        torneo.add(Pair(equipo,total))
        i++
    }

    var lista_puntaje: MutableList<Int> = mutableListOf()
    var max_punt :Int
    for((equipo,puntos )in torneo){
        lista_puntaje.add(puntos)
    }
    max_punt = lista_puntaje.max()

    for((equipo,puntos )in torneo){
        if (puntos == max_punt){
            println("El equipo campeon es ${equipo} con un total de ${puntos} puntos")
        }
    }
}