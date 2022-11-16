package Corte_1

/* Modelaje de la funcion
Entradas
* altura --> Int
* radio --> Double
Salidas
! volumen --> Int
 */

//funcion
fun volumen_cono(altura:Int,radio:Double):Int{
    val volumen = (Math.PI*Math.pow(radio,2.0)*altura)/3
    return volumen.toInt()
}

//programa
fun main(){
    println("Indique la altura del cono:")
    val altura = readLine()!!.toInt()
    println("Indique el radio del cono:")
    val radio = readLine()!!.toDouble()
    println(volumen_cono(altura,radio))
}