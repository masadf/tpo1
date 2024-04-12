package first

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import kotlin.math.cos

class MathUtilsTest {

    @ParameterizedTest(name = "sec({0}) = {1}")
    @CsvFileSource(resources = ["/sec_table.csv"], numLinesToSkip = 1, delimiter = ';')
    fun sec(x: Double, y: Double) {
        assertAll(
            {
                assertEquals(MathUtils.sec(x), y, 0.0001)
            }
        )
    }

    @Test
    fun `sec with math lib`() {
        for (x in -10..10) {
            assertEquals(MathUtils.sec(x.toDouble()), 1 / cos(x.toDouble()), 0.0001)
        }
    }
}