package Taller_2

/* Modelaje de las funciones
Entradas
*a --> Int -->b
*oper --> String
*cat_o --> cat_a
Salidas
! Pair --> <Any,String>
 */

//funciones
fun operacion(a:Int,b:Int,oper: String):Pair<Any,String>{
    if (oper.equals("+")){
        return Pair(a+b,"Suma")
    }else if(oper.equals("-")){
        return Pair(a-b,"resta")
    }else if(oper.equals("*")){
        return Pair(a*b,"multiplicacion")
    }else if(oper.equals("/")){
        return Pair(a/b,"division")
    }else if(oper.equals("%")){
        return Pair(a%b,"modulo")
    }else if(oper.equals("**")){
        val a = a.toDouble()
        val b = b.toDouble()
        return Pair(Math.pow(a,b),"potencia")
    }else{
        return Pair("Invalido","opcion valida")
    }
}

//programa
fun main(){
    val a = 15
    val b = 70
    val oper = "-"
    val operacion = operacion(a,b,oper)
    println("Resultado: ${operacion.first} y se realicio una ${operacion.second}")
}