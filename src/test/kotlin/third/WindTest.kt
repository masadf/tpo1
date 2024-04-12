package third

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class WindTest {
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
    fun noise() {
        val wind = Wind()

        wind.noise()

        assertEquals("Ветер шумит\n", outContent.toString())
    }
}