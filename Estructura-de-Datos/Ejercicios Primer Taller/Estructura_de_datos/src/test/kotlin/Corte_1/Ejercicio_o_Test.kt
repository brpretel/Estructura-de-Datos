package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_o_Test {

    @Test
    fun contaminacion() {
        val expected =  560000
        assertEquals(expected, Corte_1.contaminacion(800))
    }
}