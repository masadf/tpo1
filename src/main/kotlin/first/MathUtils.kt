package first

import kotlin.math.pow

object MathUtils {

    fun sec(x: Double): Double {
        var result = 0.0
        var fact = 1.0
        val n = 100

        for (i in 0..2 * n step 2) {
            if (i != 0) fact *= (i * (i - 1))
            val xSquare = x.pow(i)
            result += (-1.0).pow(i / 2) * xSquare / fact
        }

        return 1.0 / result
    }
}