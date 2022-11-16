package Taller_2

/* Modelaje de la funcion
Entradas
*dia --> String
Salidas
! String
 */

//funcion
fun dias(dia:String):String {
    val dias = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    for ((posicion, valor) in dias.withIndex()) {
        if (valor == "Domingo") {
            return "Lunes"
        }else if (valor == dia){
            val mañana = posicion + 1
            return (dias[mañana])
        }else{
            return continue
        }
    }
    return "Adios"
}

//programa
fun main(){
    val dia = "Domingo"
    println("El dia de mañana es ${dias(dia)}")
}