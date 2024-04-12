package third

import TestUtils.createDonut
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.math.BigDecimal.ZERO


class PavementTest {
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
    fun run() {
        val pavement = Pavement(listOf(createDonut(), createDonut(sum = ZERO)))

        pavement.run()

        assertEquals(
            "Из мостовой:\n" +
                    "Выскакивает HOT пончик стоимостью 10 пенсов за штуку\n" +
                    "Выскакивает HOT пончик стоимостью 0 пенсов за штуку\n", outContent.toString()
        )
    }

    @Test
    fun `run if empty`() {
        val pavement = Pavement(emptyList())

        pavement.run()

        assertEquals("", outContent.toString())
    }
}