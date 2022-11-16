package Corte_1

/* Modelaje de la funcion
Entradas
* precio --> Int
Salidas
! total --> Int
 */

//funcion
fun descuentos(precio:Int): Pair<Double,Double>{
    val descuento = precio * 0.05
    val precio_desc = precio - descuento
    val iva = precio_desc * 0.19
    val total = precio_desc + iva
    return Pair(precio_desc, total)
}

//programa
fun main(){
    println("Indique el valor del producto:")
    val precio = readLine()!!.toInt()
    val first = descuentos(precio).first
    val second = descuentos(precio).second
    println("El precio con descuento es de: ${first}")
    println("El precio final con descuento mas el Iva es de: ${second} pesos")
}