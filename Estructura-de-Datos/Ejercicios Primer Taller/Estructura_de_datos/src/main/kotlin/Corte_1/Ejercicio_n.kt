package Corte_1

/* Modelaje de la funcion
Entradas
* num_pc --> Int
Salidas
! cant_cables --> String
 */

//funcion
fun cables(num_pc:Int):String{
    val par = num_pc%2
    val cant_cables = if (par == 0){
        val cables = num_pc/2
        return "Necesita un total de ${cables} cables"
    }else{
        return "Debe tener una cantidad par de computadoras"
    }
    return cant_cables
}

//programa
fun main(){
    println("Ingrese la cantidad de computadoras:")
    val num_pc = readLine()!!.toInt()
    println(cables(num_pc))
}