package moneylovertransformer

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class TableTransformerTest {

    @Test
    fun testTransformSpending() {
        val transformer = TableTransformer()
        val occurredAt = LocalDate.now()
        val row = MoneyLoverRow(
            occurredAt,
            "Description",
            -15.0,
            MoneyLoverCategory.ENTERTAINMENT,
            MoneyLoverAccount.CASH
        )
        val inputRows = listOf(row)
        val zenMoneyRow = ZenMoneyRow(
            occurredAt,
            ZenMoneyCategory.ENTERTAINMENT,
            "Віталюр",
            ZenMoneyAccount.CASH,
            -15.0,
            null,
            null,
            "Description"
        )
        val resultRows = listOf(zenMoneyRow)

        val transformedRows = transformer.transform(inputRows)

        assertEquals(resultRows, transformedRows)
    }

    @Test
    fun testTransformIncome() {
        val transformer = TableTransformer()
        val occurredAt = LocalDate.now()
        val row = MoneyLoverRow(
            occurredAt,
            null,
            15.0,
            MoneyLoverCategory.ENTERTAINMENT,
            MoneyLoverAccount.CASH
        )
        val inputRows = listOf(row)
        val zenMoneyRow = ZenMoneyRow(
            occurredAt,
            ZenMoneyCategory.ENTERTAINMENT,
            null,
            null,
            null,
            ZenMoneyAccount.CASH,
            15.0,
            null
        )
        val resultRows = listOf(zenMoneyRow)

        val transformedRows = transformer.transform(inputRows)

        assertEquals(resultRows, transformedRows)
    }

    @Test
    fun testTransformTransfer() {
        val transformer = TableTransformer()
        val occurredAt = LocalDate.now()
        val rowFrom = MoneyLoverRow(
            occurredAt,
            "Send to BPS",
            -15.0,
            MoneyLoverCategory.ENTERTAINMENT,
            MoneyLoverAccount.CASH
        )
        val rowTo = MoneyLoverRow(
            occurredAt,
            "Received from CASH",
            -15.0,
            MoneyLoverCategory.ENTERTAINMENT,
            MoneyLoverAccount.BPS
        )
        val inputRows = listOf(rowFrom, rowTo)
        val zenMoneyRow = ZenMoneyRow(
            occurredAt,
            ZenMoneyCategory.ENTERTAINMENT,
            "Віталюр",
            ZenMoneyAccount.CASH,
            -15.0,
            null,
            null,
            "Description"
        )
        val resultRows = listOf(zenMoneyRow)

        val transformedRows = transformer.transform(inputRows)

        assertEquals(resultRows, transformedRows)
    }
}

//        val fromMarker = "Send to"
//        val toMarker = "Received from"
