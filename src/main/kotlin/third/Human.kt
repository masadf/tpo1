package third

import third.Human.Action.RUN
import third.Human.Action.UNDERSTAND

class Human(
    val name: String,
    var action: Action
) {
    fun run() {
        action = RUN
        println("$name побежал")
    }

    fun understand() {
        action = UNDERSTAND
        println("$name понял")
    }

    enum class Action {
        STAND, RUN, UNDERSTAND
    }
}

