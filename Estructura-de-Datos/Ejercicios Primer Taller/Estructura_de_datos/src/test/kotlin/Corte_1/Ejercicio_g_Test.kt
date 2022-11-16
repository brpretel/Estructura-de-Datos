package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_g_Test {

    @Test
    fun cobro() {
        val expected = 1500000
        assertEquals(expected, Corte_1.cobro(50000,30))
    }
}