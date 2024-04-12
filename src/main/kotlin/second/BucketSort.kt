package second

import kotlin.Int.Companion.MIN_VALUE
import kotlin.math.sqrt


object BucketSort {
    fun sort(listToSort: List<Int>): List<Int> {
        val numberOfBuckets = sqrt(listToSort.size.toDouble()).toInt()
        val buckets: ArrayList<ArrayList<Int>> = ArrayList(numberOfBuckets)
        for (i in 0 until numberOfBuckets) {
            buckets.add(ArrayList())
        }

        val max = findMax(listToSort)

        for (i in listToSort) {
            buckets[hash(i, max, numberOfBuckets)].add(i)
        }

        val comparator = Comparator.naturalOrder<Int>()

        buckets.forEach { it.sortWith(comparator) }

        return buckets.reduce { el1, el2 -> el1.plus(el2) as ArrayList<Int> }
    }

    private fun hash(i: Int, max: Int, numberOfBuckets: Int): Int {
        return (i.toDouble() / max * (numberOfBuckets - 1)).toInt()
    }

    private fun findMax(input: List<Int>): Int {
        var m = MIN_VALUE
        for (i in input) {
            m = i.coerceAtLeast(m)
        }
        return m
    }
}