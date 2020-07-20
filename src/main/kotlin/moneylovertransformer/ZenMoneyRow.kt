package moneylovertransformer

import java.time.LocalDate

data class ZenMoneyRow(
    val occurredAt: LocalDate,
    val category: ZenMoneyCategory,
    val payer: String?,
    val account: ZenMoneyAccount?,
    val amountPayed: Double?,
    val accountReceiver: ZenMoneyAccount?,
    val amountReceived: Double?,
    val note: String?
) {

}
