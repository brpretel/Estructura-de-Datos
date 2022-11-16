package Taller_5


fun viejos(list: MutableList<Pair<String,Int>>):String{
    var viejo = ""
    var años: MutableList<Int> = mutableListOf()

    for((x,y) in list){
        años.add(y)
    }
    var men= años.min()

    for((nombre,año) in list){
        if(año == men){
            viejo = nombre
        }
    }
    return viejo
}


fun main(){
    print("Cuantos estudiantes va a ingresar?")
    val reps = readLine()!!.toInt()
    var i = 0
    var lista: MutableList<Pair<String,Int>> = mutableListOf()
    println("Ingrese el nombre y edad:")
    var datos = ""

    var a = ""
    var b = 1

    while (i!=reps) {
        datos = readLine()!!.toString()
        a= datos.split(" ")[0]
        b= datos.split(" ")[1].toInt()
        lista.add(Pair(a,b))
        i+=1
    }
    print("${viejos(lista)} es el mas viejo de la lista")
}