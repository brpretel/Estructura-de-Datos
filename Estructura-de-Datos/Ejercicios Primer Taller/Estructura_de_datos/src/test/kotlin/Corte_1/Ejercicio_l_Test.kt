package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_l_Test {

    @Test
    fun becas() {
        val expected = Pair("Haz ganado una BECA por un valor de", "$1000.00")
        assertEquals(expected, Corte_1.becas(20,80))
    }
}