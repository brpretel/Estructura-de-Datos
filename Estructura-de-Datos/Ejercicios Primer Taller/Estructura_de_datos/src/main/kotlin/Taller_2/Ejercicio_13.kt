package Taller_2

/* Modelaje de la funcion
Entradas
*sueldo --> Int
Salidas
! Pair<Double,Double>
 */

//funcion
fun sueldo(sueldo:Int):Pair<Double,Double>{
    val sueldo = sueldo.toDouble()
    if (sueldo>0 && sueldo<=800000){
        val aumento = sueldo * 0.10
        val nuevo_sueldo = sueldo + aumento
        return  Pair(aumento,nuevo_sueldo)
    }else if (sueldo >800000 && sueldo <= 1200000){
        val aumento = sueldo * 0.08
        val nuevo_sueldo = sueldo + aumento
        return  Pair(aumento,nuevo_sueldo)
    }else{
        val aumento = sueldo * 0.05
        val nuevo_sueldo = sueldo + aumento
        return  Pair(aumento,nuevo_sueldo)
    }
}

//programa
fun main(){
    val sueldo = sueldo(1150000)
    println("El aumento del sueldo es de: ${sueldo.first} y el nuevo sueldo es de: ${sueldo.second}")
}