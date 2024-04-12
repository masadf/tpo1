package third

class Sky(
    private val fishes: List<Fish>
) {
    fun run() {
        if (fishes.isNotEmpty()) {
            println("С небес:")
            fishes.forEach { it.dive() }
        }
    }
}

