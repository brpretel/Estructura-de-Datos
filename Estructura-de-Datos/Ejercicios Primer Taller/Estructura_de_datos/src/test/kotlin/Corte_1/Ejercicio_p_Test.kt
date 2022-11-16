package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_p_Test {

    @Test
    fun descarga() {
        val expected =   Triple("hours:${1}","minutes:${60}","seconds:${14}")
        assertEquals(expected, Corte_1.descarga(17895))
    }
}