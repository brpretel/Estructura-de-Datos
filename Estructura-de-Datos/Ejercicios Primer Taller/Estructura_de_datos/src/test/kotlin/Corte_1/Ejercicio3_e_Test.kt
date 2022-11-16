package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_e_Test {

    @Test
    fun edad() {
        val expected = 24
        assertEquals(expected, Corte_1.edad(1998))
    }
}