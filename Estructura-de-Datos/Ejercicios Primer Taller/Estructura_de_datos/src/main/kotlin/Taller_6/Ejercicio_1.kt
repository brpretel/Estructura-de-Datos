package Taller_6

import java.lang.Math.PI
import java.lang.Math.sqrt

class Pendulo {

    private var l: Double = 0.0
    protected var a: Double = 0.0

    constructor()//Primario
    constructor(l: Double, a: Double) {
        this.l = l
        this.a = a
    }

    //Analizadoras o métodos de get
    fun getlongitud() = this.l
    fun getaceleracion() = this.a

    //Modificadores o set
    fun setñ(nuevo: Double) {
        if (nuevo != 0.0) {
            this.l = nuevo
        }
    }

    fun seta(nuevo_a: Double) {
        if (nuevo_a != 0.0) {
            this.a = nuevo_a
        }
    }

    //Métodos
    fun periodoOscilacion() = 2 * PI * sqrt(this.a / this.l)
}

data class Pendulo2(
    private var l: Double = 0.0,
    private var a: Double = 0.0
) {
    //Métodos
    fun periodoOscilacion() = 2 * PI * sqrt(this.a / this.l)
}

fun main() {

    //var y=Pendulo2(2.0 , 3.0)
    //var x = Pendulo2()
    var x = Pendulo()
    var opc: Int
    do {
        println("0.salir\n1.Crear\n2.imprimir\n3.Calcular periodo de oscilación")
        print("Escoja una opcion")
        opc = readLine()!!.toInt()
        when (opc) {
            1 -> {
                print("Longitud: ")
                val longitud = readLine()!!.toDouble()
                print("Aceleracion: ")
                val aceleracion = readLine()!!.toDouble()
                //x = Pendulo2(longitud, aceleracion)
                x = Pendulo(longitud, aceleracion)
            }

            2 -> {
                //println("La longitud es de ${x.getlongitud()} y la aceleracion es de ${x.getaceleracion()}")
                println("La longitud es de ${x.getlongitud()} y la aceleracion es de ${x.getaceleracion()}")
            }

            3 -> {
                println("El periodo de de acelración: ${x.periodoOscilacion()}")
            }
        }
    } while (opc != 0)
}