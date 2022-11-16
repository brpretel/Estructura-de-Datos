package Taller_3

//funcion
fun descuento(precio:Int):Int{
    if (precio < 100000){
        var descuento = precio * 0.12
        var precio_final = precio - descuento
        return precio_final.toInt()
    }else{
        var descuento= precio * 0.18
        var precio_final = precio - descuento
        return precio_final.toInt()
    }
}

//programa
fun main(){
    println("Cuantos libros desea ingresar?")
    val x = readLine()!!.toInt()
    for(i in 1 .. x){
        println("Ingrese el valor del libro # ${i}")
        val precio = readLine()!!.toInt()
        if (precio > 0){
            println("El precio neto del Libro # ${i} es de: ${descuento(precio)}")
        }else{
            print("Adios")
        }
    }
}