package moneylovertransformer

import java.time.LocalDate

class MoneyLoverRow(
    val occurredAt: LocalDate,
    val note: String?,
    val amount: Double,
    val category: MoneyLoverCategory,
    val account: MoneyLoverAccount
) {

}
