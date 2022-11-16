package Taller_4

fun masa_corp(m:Int,h:Int):Int{
    return m*h*2
}

fun main(){
    println("Cuantos personas va a ingresar")
    val reps = readLine()!!.toInt()
    var i = 0

    var nombre:String
    var m:Int
    var h:Int
    var total_masa: Int
    var personas: MutableList<Pair<String,Int>> = mutableListOf()

    while (i != reps){
        println("Ingrese el nombre de la persona ${i+1}")
        nombre = readLine()!!.toString()
        println("Ingrese la cantidad de masa de ${nombre}")
        m = readLine()!!.toInt()
        println("Ingrese la altura de ${nombre}")
        h = readLine()!!.toInt()
        total_masa = masa_corp(m,h)
        personas.add(Pair(nombre,total_masa))
        println(total_masa)
        i++
    }

    var masas: MutableList<Int> = mutableListOf()
    var max_masa :Int
    for((nombre,totales_masas )in personas){
        masas.add(totales_masas)
    }
    max_masa = masas.max()

    for((nombre,totales_masas )in personas){
        if (totales_masas == max_masa){
            println("La persona mas obesa es ${nombre} con una masa corporal de ${totales_masas}")
        }
    }
}