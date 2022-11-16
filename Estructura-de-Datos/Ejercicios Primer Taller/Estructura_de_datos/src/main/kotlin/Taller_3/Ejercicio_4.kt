package Taller_3

//funcion
fun nomina(horasT:Double):Double{

    var salario =0.0
    if(horasT<=35){
        salario = 15_000.0*horasT
    }else if (horasT>35 && horasT <60){
        salario = (35.0*15_000.0)+((horasT-35.0)*18_000.0)
    }else{
        salario = (35.0*15_000.0)+(25.0*18_000.0)+((horasT-59.0)*25_000.0)
    }
    return salario
}

//programa
fun main(){
    var cantEmple = 0
    var horasT = 0.0
    println("Cuantos empleados tiene la empresa? ")
    cantEmple = readLine()!!.toInt()
    repeat(cantEmple){
        println("Cuantas horas trabaja el empleado ${it+1}?")
        horasT = readLine()!!.toDouble()
        println("El salario neto del trabajador es de ${nomina(horasT)} pesos colombianos")
    }
}