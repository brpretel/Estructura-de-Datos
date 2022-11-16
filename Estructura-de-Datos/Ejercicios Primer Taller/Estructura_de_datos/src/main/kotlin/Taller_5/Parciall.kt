package Taller_5

fun func_1(lists:MutableList<Triple<String,String,Pair<Int,Int>>>,municipio:String,departamento:String):Int {
    val municipios: MutableList<String> = mutableListOf()
    for ((nom_muni, nom_dep, x) in lists) {
        municipios.add(nom_muni)
    }

    for ((nom_muni, nom_dep, x) in lists) {
        if (municipio in municipios) {
            return 2022 - (x.second)
        }
    }
    return -1
}


fun func_2(lists:MutableList<Triple<String,String,Pair<Int,Int>>>):Double{

    val municipios: MutableList<String> = mutableListOf()
    for ((nom_muni,nom_dep,x) in lists){
        municipios.add(nom_muni)
    }

    var cant = 0

    for ((nom_muni,nom_dep,x) in lists){
        if((nom_dep == "CALDAS" || nom_dep=="RISARALDA"||nom_dep=="QUINDÍO") && x.second %2 !=0){
            cant +=1
        }
    }
        return cant/municipios.size.toDouble()
}


fun func_3(lists:MutableList<Triple<String,String,Pair<Int,Int>>>):Int{
    var cant = 0

    val municipios: MutableList<Int> = mutableListOf()
    for ((nom_muni,nom_dep,x) in lists){
        municipios.add(x.second)
    }
    for ((nom_muni,nom_dep,x) in lists){
        if(x.second>100 && (x.first>20000 && x.first<100000)){
            cant +=1
        }
    }
    return (cant*100)/municipios.size
}

fun main(){

    var lista: MutableList<Triple<String,String,Pair<Int,Int>>> = mutableListOf()

    var datos = ""

    var a = ""
    var b = ""
    var c :Pair<Int,Int>
    var pair_x: Int
    var pair_y: Int


    datos = readLine()!!.toString()
    a= datos.split(" ")[0]
    b= datos.split(" ")[1]
    pair_x= readLine()!!.toInt()
    pair_y= readLine()!!.toInt()
    c = Pair(pair_x,pair_y)

    lista.add(Triple(a,b,c))

    datos = readLine()!!.toString()
    a= datos.split(" ")[0]
    b= datos.split(" ")[1]
    pair_x= readLine()!!.toInt()
    pair_y= readLine()!!.toInt()
    c = Pair(pair_x,pair_y)

    lista.add(Triple(a,b,c))



    println(func_1(lista,"Bogota","Cundinamarca"))
    println(func_2(lista))
    println(func_3(lista))
}