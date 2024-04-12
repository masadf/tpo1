package third

import TestUtils.createDonut
import TestUtils.createHuman
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import third.Fish.View.TERRIBLE
import third.Human.Action.STAND
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class WorldTest {
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
    fun start() {
        val donuts = listOf(createDonut(), createDonut())
        val fishes = listOf(Fish(TERRIBLE))
        val peoples = listOf(createHuman("Артур", STAND), createHuman("Форд", STAND))

        World(Pavement(donuts), Sky(fishes), peoples).start()

        assertEquals(
            "Ветер шумит\n" +
                    "Дудка визжит\n" +
                    "Дудка визжит\n" +
                    "Из мостовой:\n" +
                    "Выскакивает HOT пончик стоимостью 10 пенсов за штуку\n" +
                    "Выскакивает HOT пончик стоимостью 10 пенсов за штуку\n" +
                    "С небес:\n" +
                    "Спикировала TERRIBLE рыба\n" +
                    "Артур понял\n" +
                    "Артур побежал\n" +
                    "Форд понял\n" +
                    "Форд побежал\n", outContent.toString()
        )
    }
}