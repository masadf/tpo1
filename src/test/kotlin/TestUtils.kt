import third.Amount
import third.Donut
import third.Human
import third.Human.Action
import third.Human.Action.STAND
import java.math.BigDecimal

object TestUtils {
    fun createDonut(sum: BigDecimal = BigDecimal.TEN, currency: String = "пенсов") = Donut(
        amount = Amount(sum, currency),
        state = Donut.State.HOT
    )

    fun createHuman(name: String = "Боб", action: Action = STAND) = Human(
        name = name,
        action = action
    )
}