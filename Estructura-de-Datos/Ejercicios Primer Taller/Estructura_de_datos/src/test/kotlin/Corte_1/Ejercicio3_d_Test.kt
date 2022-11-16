package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_d_Test {

    @Test
    fun dolares() {
        val expected = 1163
        assertEquals(expected, Corte_1.dolares(5000000,4300.0))
    }
}