package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_k_Test {

    @Test
    fun menor() {
        val lista = mapOf(
            "Brian" to 18,
            "Jose" to 23,
            "Charlie" to 40
        )
        val expected = lista.minWith(compareBy { it.value })
        assertEquals(expected, Corte_1.menor("Brian",18,"Jose", 23, "Charlie",40))
    }
}