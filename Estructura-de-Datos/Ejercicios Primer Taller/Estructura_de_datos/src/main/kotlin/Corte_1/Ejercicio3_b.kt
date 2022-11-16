package Corte_1

/* Modelaje de la funcion
Entradas
*Valor alquiler --> Double -->valoralquiler
*Numero_Estudiantes --> Int -->numero_estudiantes
Salidas
! numero_bicicletas -->int --> numero_bicletas
! el valor del alquiler --> Double --> el_valor_alquiler
 */

//funcion
fun valor_bicicleta (valoralquiler: Double, numero_estudiantes : Int):Pair <Int, Double> {
    val numero_bicicletas = numero_estudiantes/2
    val el_valor_alquiler = numero_bicicletas*valoralquiler

    return Pair (numero_bicicletas, el_valor_alquiler)
}

//programa
fun main() {
    print("Ingrese el valor del alquiler: ")
    val v= readLine()!!.toDouble()
    print ("Ingrese el numero de estudiantes: ")
    var n = readLine()!!.toInt()
    var primera = valor_bicicleta(v,n).first
    var segunda = valor_bicicleta(v,n).second
    println("El numero de bicicletas es ${primera}, el valor a pagar es ${segunda}")
}