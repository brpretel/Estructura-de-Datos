package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_a_Test {

    @Test
    fun area_triangulo() {
        val expected = 50
        assertEquals(expected, area_triangulo(10, 10))
    }
}