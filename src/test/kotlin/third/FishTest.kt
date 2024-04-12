package third

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import third.Fish.View.TERRIBLE
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class FishTest {
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
    fun dive() {
        val fish = Fish(TERRIBLE)

        fish.dive()

        assertEquals("Спикировала TERRIBLE рыба\n", outContent.toString())
    }
}