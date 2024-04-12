package third

class Fish(
    private val view: View
) {
    fun dive() {
        println("Спикировала $view рыба")
    }

    enum class View {
        TERRIBLE
    }
}

