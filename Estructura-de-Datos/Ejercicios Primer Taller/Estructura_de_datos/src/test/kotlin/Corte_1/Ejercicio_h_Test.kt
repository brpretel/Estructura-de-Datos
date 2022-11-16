package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_h_Test {

    @Test
    fun tiempo_viaje() {
        val expected = 2.0
        assertEquals(expected, Corte_1.tiempo_viaje(150,300))
    }
}