package ean.estructuradedatos.tallerpilas


import ean.collections.IStack
import ean.collections.TLinkedStack


fun quiz(pila: IStack<String>):Int {
    var num = 1
    var copia = pila.copy()

    while(!copia.isEmpty){
        when(copia.peek()){
            "ZERO" -> num += 1
            "INC" -> num += 1
            "DEC" -> num -= 1
            "HALF" -> num/2
            "STOP" -> break
            "DUP" -> num *= 2
        }
        copia.pop()
    }
    return num
}


fun main(){
    var pila: IStack<String> = TLinkedStack()

    pila.push("STOP")
    pila.push("INC")
    pila.push("INC")
    pila.push("DUP")
    pila.push("DUP")
    pila.push("INC")

    print(quiz(pila))
}
