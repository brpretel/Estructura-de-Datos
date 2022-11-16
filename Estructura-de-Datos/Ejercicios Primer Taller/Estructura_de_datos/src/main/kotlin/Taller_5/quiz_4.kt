package Taller_5


fun main() {
    var datos = ""
    var a = 1
    var b = 1

    while (a != 0 && b != 0) {
        datos = readLine()!!.toString()
        a= datos.split(" ")[0].toInt()
        b= datos.split(" ")[1].toInt()
        if (a== 0 && b== 0) {
            break
        }else if (a % b == 0 || b % a == 0) {
            println("impossible")
        } else {
            println("possible")
        }
        print("")
    }
}