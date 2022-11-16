package Taller_2

/* Modelaje de las funciones
Entradas
*base --> Int -->altura
*cat_o --> cat_a
Salidas
! Triple --> <Int,Int,Int>
! Triple --> <Double,Double,Double>
 */

//funciones
fun rectangulo(base:Int,altura:Int):Triple<Int,Int,Int>{
    val area = base*altura
    return Triple(base,altura,area)
}

fun triangulo(cat_o:Int, cat_a:Int):Triple<Double,Double,Double>{
    val cat_o = cat_o.toDouble()
    val cat_a = cat_a.toDouble()
    val h = Math.pow(cat_a,2.0) + Math.pow(cat_o,2.0)
    return Triple(cat_o,cat_a,h)
}

//programa
fun main(){
    val rectangulo = rectangulo(10,10)
    val triangulo = triangulo(5,5)

    val area_rectangulo = rectangulo.third
    val area_triangulo = Math.pow(triangulo.second,2.0) * Math.pow(triangulo.first,2.0) / 2

    val A = rectangulo.second+triangulo.first
    val B = rectangulo.first
    val C = rectangulo.second
    val D = triangulo.third

    val perimetro_terreno = A+B+C+D
    val area_terreno = area_rectangulo+area_triangulo

    println("El area del terreno es de ${area_terreno}cm y su perimetro es de ${perimetro_terreno}cm")
}