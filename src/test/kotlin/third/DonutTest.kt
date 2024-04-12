package third

import TestUtils.createDonut
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.math.BigDecimal.ZERO


class DonutTest {
    private val outContent = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outContent))
    }

    @AfterEach
    fun setOut() {
        System.setOut(System.out)
    }

    @Test
    fun leapOut() {
        val donut = createDonut()

        donut.leapOut()

        assertEquals("Выскакивает HOT пончик стоимостью 10 пенсов за штуку\n", outContent.toString())
    }

    @Test
    fun `leapOut with another donut amount`() {
        val donut = createDonut(sum = ZERO, currency = "рублей")

        donut.leapOut()

        assertEquals("Выскакивает HOT пончик стоимостью 0 рублей за штуку\n", outContent.toString())
    }
}