fun cono(h: Double, r:Double):Triple<Double,Double,Double>{
    val g = Math.sqrt(Math.pow(h,2.0)+ Math.pow(r,2.0))
    val a = Math.PI*r*(r+g)
    val v = (Math.PI*h*Math.pow(r,2.0))/3

    return Triple(g,a,v)
}

fun barco(capacidad:Int,x_cajas:Int,peso_cajas:Int,precio_viaje:Int):Pair<Int,Int>{
        var viajes = x_cajas*peso_cajas/capacidad
        if (viajes<1){
            viajes = 1
        }
        val costo_total= viajes*precio_viaje

    return Pair(viajes, costo_total)
}



fun main(){

}