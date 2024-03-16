package luminitetime.kotlin.springboot.luminitebank.service

import io.mockk.mockk
import io.mockk.verify
import luminitetime.kotlin.springboot.luminitebank.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        bankService.getBanks()

        //then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}