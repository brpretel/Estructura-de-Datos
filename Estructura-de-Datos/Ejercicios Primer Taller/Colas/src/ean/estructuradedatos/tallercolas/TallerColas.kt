package ean.estructuradedatos.tallercolas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto Taller con las Colas
 * Autor: Universidad EAN - Marzo 18, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/* Función que recibes una cola de palabras y
   que retorne la palabra más larga de la cola.
   La cola original no debe verse modificada. Usa una copia.
 */
fun palabraMasLarga(colaPals: IQueue<String>): String {
    var copia = colaPals.copy()
    val lista: MutableMap<String, Int> = mutableMapOf()

    while(!copia.isEmpty){
        var pos = copia.dequeue()
        lista[pos]= pos.length
    }

    return lista.maxWith(Comparator { x, y -> x.value.compareTo(y.value)}).key

}

/*
Escriba una función genérica que determine el tamaño de una cola.
La cola original no debe verse modificada.
*/
fun <T> tamCola(cola: IQueue<T>): Int {

    var copia = cola.copy()
    var c = 0
    while(!copia.isEmpty){
        c= c+1
        copia.dequeue()
    }
    return c
}

/*
Función genérica que recibe un elemento y una cola y que
retorna true si el elemento está en la cola y false sino
se encuentra el elemento en la cola. La cola original no
debe verse modificada.
 */
fun <T> existeElemento(col: IQueue<T>, elem: T): Boolean {
    var copia = col.copy()
    var b = false
    while(!copia.isEmpty){
        if (elem == copia.dequeue()){
            b = true
        }
    }
    return b
}

/*
Función genérica para determinar si dos colas son iguales.
Ninguna de las dos colas deben verse modificadas.
 */
fun <T> igualesColas(col1: IQueue<T>, col2: IQueue<T>): Boolean {
    var copia = col1.copy()
    var copia2 = col2.copy()
    var v = false
    if (tamCola(copia) == tamCola(copia2)){
        while (!copia.isEmpty){
            var a = copia.dequeue()
            var b = copia2.dequeue()
            if (a == b){
                v = true
            }
        }
    }
    return v
}

/*
Función genérica que invierte los elementos de la cola.
Debe modificar la cola. Puede usar una pila.
 */
fun <T> invertirCola(col: IQueue<T>) {
    val pila: IStack<T> = TLinkedStack()
    while(!col.isEmpty){
        pila.push(col.dequeue())
    }

    while(!pila.isEmpty){
        col.enqueue(pila.peek())
        pila.pop()
    }
}


/*
Funcion generica que saque el ultimo elemento de la cola,
sin modificar la cola original
 */
fun <T> ultimo(col: IQueue<T>): T {

    TODO("hACER")
}

//--------------------------------------------------------------------
// Pruebas de las funciones anteriores
//--------------------------------------------------------------------
class Pruebas {
    @Test
    fun prueba1() {
        val cola: IQueue<String> = TLinkedQueue()

        cola.enqueue("hola")
        cola.enqueue("carro")
        cola.enqueue("internacionalizacion")
        cola.enqueue("relojito")
        cola.enqueue("ana")
        cola.enqueue("vericueto")
        cola.enqueue("rosales")

        assertEquals("internacionalizacion", palabraMasLarga(cola))
        println("Prueba superada ☺")
    }

    @Test
    fun prueba2() {
        val cola: IQueue<Double> = TLinkedQueue()

        cola.enqueue(4.5)
        cola.enqueue(-1.17)
        cola.enqueue(10.87)
        cola.enqueue(100.1)
        cola.enqueue(451.811)

        assertEquals(5, tamCola(cola))
        println("Prueba superada ☺")
    }

    @Test
    fun prueba3() {
        val c: IQueue<Char> = TLinkedQueue()

        c.enqueue('x')
        c.enqueue('d')
        c.enqueue('a')
        c.enqueue('f')
        c.enqueue('c')
        c.enqueue('3')
        c.enqueue('#')
        c.enqueue('=')
        c.enqueue('¿')
        c.enqueue('«')
        c.enqueue('y')

        assertTrue {
            existeElemento(c, '#')
        }

        assertFalse {
            existeElemento(c, '?')
        }

        println("Prueba superada ☺")
    }

    @Test
    fun prueba4() {
        var cola1: IQueue<Int> = TLinkedQueue()
        var cola2: IQueue<Int>

        cola1.enqueue(4)
        cola1.enqueue(71)
        cola1.enqueue(27)
        cola1.enqueue(-34171)
        cola1.enqueue(181)

        cola2 = cola1.copy()

        assertTrue(igualesColas(cola1, cola2))

        cola2.enqueue(36)
        cola2.enqueue(23)

        assertFalse(igualesColas(cola2, cola1))

        println("Prueba superada ☺")
    }

    @Test
    fun prueba5() {
        var c1: IQueue<Char> = TLinkedQueue()
        var c2: IQueue<Char> = TLinkedQueue()

        c1.enqueue('x')
        c1.enqueue('y')
        c1.enqueue('z')
        c1.enqueue('w')

        c2.enqueue('w')
        c2.enqueue('z')
        c2.enqueue('y')
        c2.enqueue('x')

        assertFalse {
            igualesColas(c1, c2)
        }

        invertirCola(c1)

        assertTrue {
            igualesColas(c1, c2)
        }

        println("Prueba superada ☺")
    }
}
