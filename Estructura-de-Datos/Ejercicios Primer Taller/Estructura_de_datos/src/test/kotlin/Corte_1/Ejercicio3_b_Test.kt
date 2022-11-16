package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_b_Test {

    @Test
    fun valor_bicicleta() {
        val expected = Pair(2,10.0)
        assertEquals(expected, Corte_1.valor_bicicleta(5.0,5))
    }
}