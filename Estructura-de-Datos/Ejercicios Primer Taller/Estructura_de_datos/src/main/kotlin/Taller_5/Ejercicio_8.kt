package Taller_5

fun triangulo(base:Int,altura:Int):Int{
    return (base*altura)/2
}

fun triangulos_max_area(lista:MutableList<Triple<String,Int,Int>>):String{
    var name = ""
    var areas : MutableList<Int> = mutableListOf()
    for ((nombre,base,altura) in lista){
        areas.add(triangulo(base,altura))
        }
    val area_max = areas.max()

    for ((nombre,base,altura) in lista){
        if(triangulo(base,altura) == area_max){
            name = nombre
        }
    }
    return name
}

fun verif_triangulos(lista:MutableList<Triple<String,Int,Int>>,name:String):Any{
    var names : MutableList<String> = mutableListOf()
    var area = 0.0
    for ((nombre,base,altura) in lista){
        names.add(nombre)
    }
    if (name in names){
        for ((nombre,base,altura)in lista){
            if (name==nombre){
                area =(triangulo(base,altura).toDouble())
            }
        }
    }else{
        area= -1.0
    }
    return area
}

fun main(){
    print("Cuantos Triangulos va a ingresar?")
    val reps = readLine()!!.toInt()
    var i = 0
    var lista: MutableList<Triple<String,Int,Int>> = mutableListOf()
    println("Ingrese el |nombre del triangulo| base | altura:")
    var datos = ""

    var a = ""
    var b = 1
    var c = 1

    while (i!=reps) {
        datos = readLine()!!.toString()
        a= datos.split(" ")[0]
        b= datos.split(" ")[1].toInt()
        c= datos.split(" ")[2].toInt()
        lista.add(Triple(a,b,c))
        i+=1
    }

    var triangulo_grande = triangulos_max_area(lista)
    println(lista)
    println("El nombre del triangulo de mayor area es: ${triangulo_grande}")
    println("Y su area es de= ${verif_triangulos(lista,triangulo_grande)}")
}