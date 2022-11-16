package Taller_4


//Funcion
fun min_poblacion(list: MutableList<Triple<String,Int,String>>):String {

    var poblacionPequeña:Int = 99999999
    var nombrePequeña:String = ""

    for ((nombreMuni,poblacionMuni,departamento) in list){

        if (nombreMuni == ""){

        }
        else if (poblacionMuni<poblacionPequeña){
            poblacionPequeña = poblacionMuni
            nombrePequeña = nombreMuni

        }
    }
    return nombrePequeña
}


//Programa
fun main (){

    var poblacionPequeña:String = ""
    var list:MutableList<Triple<String,Int,String>> = mutableListOf()

    println("Nombre del municipio a verificar:")
    var nombreMuni = readln()!!.toString()

    println("Población de ese municipio:")
    var poblacionMuni = readln()!!.toInt()

    println("Nombre del departamento donde se encuentra ubicado el municipio:")
    var departamento = readln()!!.toString()

    list.add(Triple(nombreMuni,poblacionMuni,departamento))

    while (nombreMuni != "" || poblacionMuni > 0){

        println("Nombre del municipio a verificar:")
        nombreMuni = readln()!!.toString()
        println("Población de ese municipio:")
        poblacionMuni = readln()!!.toInt()
        println("Nombre del departamento donde se encuentra ubicado el municipio:")
        departamento = readln()!!.toString()
        list.add(Triple(nombreMuni,poblacionMuni ,departamento))

    }

    println("El nombre del municipio menos poblado es: ${min_poblacion(list)}")
}