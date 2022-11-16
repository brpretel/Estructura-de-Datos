package Taller_3

//funcion
fun sinoPrimo(numero: Int): Boolean {

    var numPrimo = true
    for (i in 2..numero / 2) {
        if (numero % i == 0) {
            numPrimo = false
            break
        }
    }
    return numPrimo
}

//programa
fun main(args: Array<String>) {

    println("Indique numero entero")
    val numero = readLine()!!.toInt()

    println("El número es primo o no?: ${sinoPrimo(numero)}")
    var numMenor = 0

    print("Números primos entre $numMenor y $numero: ")
    while (numMenor < numero) {
        if (sinoPrimo(numMenor))
            print(numMenor.toString() + " ")
        ++numMenor
    }
}