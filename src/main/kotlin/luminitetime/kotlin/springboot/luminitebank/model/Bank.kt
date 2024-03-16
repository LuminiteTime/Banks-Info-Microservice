package luminitetime.kotlin.springboot.luminitebank.model

data class Bank(
    var accountNumber: String,
    var trust: Double,
    var transactionFee: Int
)
