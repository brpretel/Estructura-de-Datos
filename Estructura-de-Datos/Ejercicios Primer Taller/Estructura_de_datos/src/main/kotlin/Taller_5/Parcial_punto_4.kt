package Taller_5

fun platos(cant_admin:Int,cant_ing:Int, precio_plato:Int):Pair<Int,Int>{
    val x_admin = cant_admin*3
    val x_ing = cant_ing

    val platos = x_admin + x_ing
    val precio = platos*precio_plato

    return Pair(platos,precio)
}