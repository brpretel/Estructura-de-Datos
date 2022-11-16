package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_c_Test {

    @Test
    fun desempleados() {
        val expected =  65
        assertEquals(expected, Corte_1.desempleados(800))
    }
}