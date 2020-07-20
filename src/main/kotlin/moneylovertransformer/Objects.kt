package moneylovertransformer

object MoneyLoverTitle {
    const val noteML = "Note"
    const val amountML = "Amount"
    const val categoryML = "Category"
    const val accountML = "Account"
    const val currencyML = "Currency"
    const val dateML = "date"
}

object ZenMoneyTitle {
    const val dateZM = "Дата"
    const val categoryZM = "Категория"
    const val payerZM = "Плательщик"
    const val accountZM = "Счет"
    const val amountPayedZM = "Сумма-расход"
    const val amountReceivedZM = "Сумма-доход"
    const val noteZM = "Комментарий"
}

enum class Currency(
    private val id: String
) {
    BYN("BYN"),
    USD("USD")
}

enum class MoneyLoverAccount(
//    private val currency: Currency,
    private val value: String
) {
    CASH("Cash"),
    BPS("BPS")
}
