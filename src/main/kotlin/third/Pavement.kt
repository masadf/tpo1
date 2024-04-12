package third

class Pavement(
    private val donuts: List<Donut>
) {
    fun run() {
        if (donuts.isNotEmpty()) {
            println("Из мостовой:")
            donuts.forEach { it.leapOut() }
        }
    }
}

