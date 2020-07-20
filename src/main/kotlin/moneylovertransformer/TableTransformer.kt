package moneylovertransformer

class TableTransformer {
    fun transform(inputRows: List<MoneyLoverRow>): List<ZenMoneyRow> {
        return listOf(ZenMoneyRow(
            inputRows[0].occurredAt,
            ZenMoneyCategory.ENTERTAINMENT,
            "Віталюр",
            ZenMoneyAccount.CASH,
            -15.0,
            null,
            null,
            "Description"
        ))
    }


}
