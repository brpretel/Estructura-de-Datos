package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_i_Test {

    @Test
    fun descuentos() {
        val expected = Pair(4750000.0,5652500.0)
        assertEquals(expected, Corte_1.descuentos(5000000))
    }
}