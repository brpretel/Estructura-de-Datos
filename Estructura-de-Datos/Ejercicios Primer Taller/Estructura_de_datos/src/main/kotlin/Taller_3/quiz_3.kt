package Taller_3

fun main() {
    val num = readln().toInt()

    var x = num
    var cn = 0
    var cinc = 0
    var veint = 0
    var diez = 0
    var dos = 0
    var cinco = 0
    var uno = 0

    while(x!=0) {
        if (x > 100) {
            x = x - 100
            cn++
        } else if (x >= 50) {
            x = x - 50
            cinc++
        } else if (x >= 20) {
            x = x - 20
            veint++
        } else if (x >= 10) {
            x = x - 10
            diez++
        } else if (x >= 5) {
            x = x - 5
            cinco++
        } else if (x >= 2){
            x= x-2
            dos ++
        }else if(x>=1){
            x=x-1
            uno++
        }

    }
    println(num)
    println("${cn} nota(s) de R$ 100,00")
    println("${cinc} nota(s) de R$ 50,00")
    println("${veint} nota(s) de R$ 20,00")
    println("${diez} nota(s) de R$ 10,00")
    println("${cinco} nota(s) de R$ 5,00")
    println("${dos} nota(s) de R$ 2,00")
    println("${uno} nota(s) de R$ 1,00")
}