package Taller_3

//funcion
fun bonificaciones(ventas:Int):Double{

    var comision = 0.0
    if(ventas >50_000){
        comision = ventas * 0.15
    }else{
        comision = ventas.toDouble()
    }
    return comision
}

//Program
fun main(){

    var ventas:Int
    var ingresos:Int
    var siguiente:String =""

    println("Indique sus ingresos: ")
    ingresos= readLine()!!.toInt()
    println("Indique el monto de la venta: ")
    ventas = readLine()!!.toInt()
    println("Los ingresos son de ${ingresos} cop, con una  comision de ${bonificaciones(ventas)} cop")
    print("Quiere continuar?: ")

    siguiente = readLine()!!.toString()
    while (siguiente == "Si"){
        println("Los ingresos son de ${ingresos} cop, con una  comision de ${bonificaciones(ventas)} cop")
        print("Quiere continuar?: ")

        siguiente = readLine()!!.toString()
        println("Indique la venta: ")
        ventas= readLine()!!.toInt()
    }

}