package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_n_Test {

    @Test
    fun cables() {
        val expected = "Necesita un total de ${5} cables"
        assertEquals(expected, Corte_1.cables(10))
    }
}