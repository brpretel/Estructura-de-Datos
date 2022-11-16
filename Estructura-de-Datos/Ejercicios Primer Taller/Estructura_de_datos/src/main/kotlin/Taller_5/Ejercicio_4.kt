package Taller_5

fun estudiantes(list: MutableList<Double>):Triple<Int,Int,Double>{
    var perdieron = 0
    var pasaron = 0
    var proms = 0.0
    for(notas in list){
        proms += notas
        if (notas < 3){
            perdieron ++
        }else{
            pasaron ++
        }
    }
    var promedios = proms/list.size
    return Triple(perdieron,pasaron,promedios)
}

fun main(){
    var notas_clase: MutableList<Double> = mutableListOf()
    println("Ingrese una nota de 1 a 5:")
    var nota = readLine()!!.toDouble()

    while(nota>0){
        notas_clase.add(nota)
        println("Ingrese una nota:")
        nota = readLine()!!.toDouble()
    }

    val one = estudiantes(notas_clase).first
    val two = estudiantes(notas_clase).second
    val tree = estudiantes(notas_clase).third
    println(notas_clase)
    println("Un total de ${one} estudiantes perdieron el curso")
    println("Un total de ${two} estudiantes pasaron el curso")
    println("El promedio del curso es de: ${tree}")
}