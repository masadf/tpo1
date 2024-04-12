package third

import TestUtils.createHuman
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import third.Human.Action.RUN
import third.Human.Action.UNDERSTAND
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class HumanTest {
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
        val human = createHuman()

        human.run()

        assertEquals(human.action, RUN)
        assertEquals("Боб побежал\n", outContent.toString())
    }

    @Test
    fun understand() {
        val human = createHuman()

        human.understand()

        assertEquals(human.action, UNDERSTAND)
        assertEquals("Боб понял\n", outContent.toString())
    }
}