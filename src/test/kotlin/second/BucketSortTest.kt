package second

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BucketSortTest {

    @Test
    fun sort() {
        val unsorted = listOf(80, 50, 60, 30, 20, 10, 70, 0, 40, 500, 600, 602, 200, 15)
        val expected = listOf(0, 10, 15, 20, 30, 40, 50, 60, 70, 80, 200, 500, 600, 602)

        val sorted: List<Int> = BucketSort.sort(unsorted)

        assertEquals(expected, sorted)
    }
}