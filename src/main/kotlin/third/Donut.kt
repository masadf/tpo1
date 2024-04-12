package third

class Donut(
    private val amount: Amount,
    private val state: State
) {
    fun leapOut() {
        println("Выскакивает $state пончик стоимостью ${amount.sum} ${amount.currency} за штуку")
    }

    enum class State {
        HOT
    }
}

