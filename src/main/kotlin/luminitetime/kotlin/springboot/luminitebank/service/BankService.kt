package luminitetime.kotlin.springboot.luminitebank.service

import luminitetime.kotlin.springboot.luminitebank.datasource.BankDataSource
import luminitetime.kotlin.springboot.luminitebank.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)
}