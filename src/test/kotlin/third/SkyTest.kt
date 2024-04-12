package third

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import third.Fish.View.TERRIBLE
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class SkyTest {
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
        val sky = Sky(listOf(Fish(TERRIBLE), Fish(TERRIBLE)))

        sky.run()

        assertEquals(
            "С небес:\n" +
                    "Спикировала TERRIBLE рыба\n" +
                    "Спикировала TERRIBLE рыба\n", outContent.toString()
        )
    }

    @Test
    fun `run if empty`() {
        val sky = Sky(emptyList())

        sky.run()

        assertEquals("", outContent.toString())
    }
}