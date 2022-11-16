package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_j_Test {

    @Test
    fun nota_final() {
        val expected = 71.5
        assertEquals(expected, Corte_1.nota_final(40,70, 88))
    }
}