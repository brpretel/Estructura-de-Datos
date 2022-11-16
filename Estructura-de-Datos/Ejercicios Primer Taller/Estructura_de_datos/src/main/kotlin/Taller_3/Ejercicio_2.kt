package Taller_3

//programa
fun comision(ventas:Double): Double{

    var c = 0.0
    if (ventas <50_000){
        c = ventas*0.07
    }
    else if (ventas>=50_000 && ventas <=99_000){
        c = ventas*0.09+5_000
    }
    else if (ventas>=100_000 && ventas < 200_000){
        c = ventas*0.11+10_000
    }
    else if(ventas in 200_000.0.. 500_000.0){
        c = ventas*0.13+20_000
    }else{
        c = ventas*0.15+40_000
    }
    return c
}

//funcion
fun main() {

    var ventas:Double
    print("Ingrese venta:" )
    ventas = readLine()!!.toDouble()
    while (ventas>0){
        println("La comision ${comision(ventas)}")
        println("Ingrese otra venta: ")
        ventas = readLine()!!.toDouble()
    }
}