package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_q_Test {

    @Test
    fun valor_presente() {
        val expected = 131172
        assertEquals(expected, Corte_1.valor_presente(170000000,4.0,5))
    }
}