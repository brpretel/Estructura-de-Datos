package Corte_1

//funcions
fun ejercicio_a(x: Double, m:Double, n:Double):Double{
    val num = Math.pow(x-m,2.0)
    val den = n-1
    val s = Math.sqrt(num/den)
    return s
}

fun ejercicio_b(y: Double):Double{
    val num = -(Math.pow(y,3.0)-1)
    val den = (y+1)-Math.sqrt(y+1)
    val p = num/den
    return p
}

fun ejercicio_c(x: Double):Double{
    val num = x*Math.pow(Math.pow(x,2.0)+1,3.0)
    val den = Math.sqrt(2*x)+1
    val z = num/den
    return z
}

fun ejercicio_d(x: Double, n: Double):Double{
    val num = Math.pow(x-2,1/n)
    val den = Math.pow(x,3.0)
    val t = 1-(num/den)
    return t
}

fun ejercicio_e(x: Int, y: Int):Boolean{
    return (x!=y) && (x<=y)
}

fun ejercicio_f(a: Int, b: Int, c:Int):Boolean{
    return (a>=(b*c))||(b<=c)
}

//programa
fun main() {
    println(ejercicio_a(2.0,4.0,5.1))
    println(ejercicio_b(2.2))
    println(ejercicio_c(2.2))
    println(ejercicio_d(2.2, 2.0))
    println(ejercicio_e(2, 3))
    println(ejercicio_f(2, 5, 4))
}