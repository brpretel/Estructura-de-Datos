package Taller_5

fun ciudades_verif(list: MutableList<String>, option:String):String{
    var verif = ""
    for(ciudad in list){
        if (ciudad.equals(option)){
            verif = "Si"
        }else{
            verif = "No"
        }
    }
    return verif
}

fun main(){
    var ciudades: MutableList<String> = mutableListOf()
    println("Ingrese una ciudad:")
    var ciudad = readLine()!!.toString()

    while(ciudad!="0"){
        ciudades.add(ciudad)
        println("Ingrese una nota:")
        ciudad = readLine()!!.toString()
    }

    println("Indique que ciudad quiere buscar:")
    val option = readLine()!!.toString()

    println(ciudades)
    println("la ciudad= ${option} ${ciudades_verif(ciudades,option)} se encuentra en la lista")

}