package luminitetime.kotlin.springboot.luminitebank.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {
    private val mockDataSource: MockBankDataSource = MockBankDataSource()
    private val banks = mockDataSource.retrieveBanks()

    @Test
    fun `should provide a collection of banks`() {
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks.map { it.accountNumber }.size).isEqualTo(banks.map { it.accountNumber }.distinct().size)
        assertThat(banks).allMatch { it.trust >= 0.0 }
        assertThat(banks).allMatch { it.transactionFee >= 0 }
    }
}