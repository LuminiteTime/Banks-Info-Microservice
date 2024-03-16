package luminitetime.kotlin.springboot.luminitebank.datasource

import luminitetime.kotlin.springboot.luminitebank.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank): Bank
}