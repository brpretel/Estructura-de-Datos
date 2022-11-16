package Corte_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio_m_Test {

    @Test
    fun volumen_cono() {
        val expected = 9424
        assertEquals(expected, Corte_1.volumen_cono(10,30.0))
    }
}