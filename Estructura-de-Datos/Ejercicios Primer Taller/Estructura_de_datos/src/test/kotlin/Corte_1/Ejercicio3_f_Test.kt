package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_f_Test {

    @Test
    fun cobro() {
        val expected = 13500
        assertEquals(expected, Corte_1.cobro(10,30,18,31,1500))
    }
}