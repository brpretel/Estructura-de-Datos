package Taller_4

//Funcion
fun FinalNote(list: MutableList<Triple<Double, Double, Double>>): Triple<Pair<Double, Double>, Pair<Int, Int>, Pair<Int, Int>> {

    var aprobados = 0
    var reprobados = 0
    var cantidad = 0
    var consolidado = 0.0
    var igual10 = 0
    var igual100 = 0
    var notaFinal = 0.0

    for ((nota1: Double, nota2: Double, nota3: Double) in list) {

        notaFinal = (nota1 * 0.25) + (nota2 * 0.25) + (nota3 * 0.5)
        consolidado = consolidado + notaFinal

        if (notaFinal >= 60.0) {
            aprobados = aprobados + 1

        } else {
            reprobados= reprobados + 1
        }

        if (notaFinal == 10.0) {
            igual10 = igual10 + 1
        } else if (notaFinal == 100.0) {
            igual100 = igual100 + 1
        }

        cantidad++

    }
    var promedio = consolidado / cantidad
    var retorno = Triple(
        Pair(notaFinal, promedio), Pair(aprobados, reprobados - 1),
        Pair(igual10, igual100)
    )
    return retorno

}

//Programa
fun main() {

    var list: MutableList<Triple<Double, Double, Double>> = mutableListOf()
    println("Ingrese la primer nota")
    var notaE1 = readln().toDouble()
    println("Ingrese la segunda nota")
    var notaE2 = readln().toDouble()
    println("Ingrese la tercera nota")
    var notaE3 = readln().toDouble()

    list.add(Triple(notaE1, notaE2, notaE3))
    var retorno = FinalNote(list)
    println("la nota final fue de ${retorno.first.first}")
    while (notaE1 >= 0 || notaE2 >= 0 || notaE3 >= 0) {


        println("Ingrese la primer nota")
        notaE1 = readln().toDouble()
        println("Ingrese la segunda nota")
        notaE2 = readln().toDouble()
        println("Ingrese la tercera nota")
        notaE3 = readln().toDouble()

        if (notaE1 >= 0 || notaE2 >= 0 || notaE3 >= 0) {
            list.add(Triple(notaE1, notaE2, notaE3))
            retorno = FinalNote(list)
            println("Nota final de ${retorno.first.first} puntos")
        }

    }
    println("La cantidad de estudiantes que aprobaron la materia es de:${retorno.second.first}")
    println("La cantidad de estudiantes que reporbaron la materia es de:${retorno.second.second}")
    println("La cantidad de estudiantes con nota final igaul a 10.0 es de:${retorno.third.first}")
    println("La cantidad de estudiantes con nota final igaul a 100.0 es de:${retorno.third.second}")
    println("El promedio de todas la notas finales es de:${retorno.first.second}")

}