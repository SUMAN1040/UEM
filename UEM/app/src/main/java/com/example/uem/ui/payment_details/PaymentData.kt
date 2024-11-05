package com.example.uem.ui.payment_details

data class PaymentData(val payment: Payment)

data class Payment(
    val bill: List<PaymentItem>
)

data class PaymentItem(
    val bill_no: String,
    val bill_total: Int,
    val date: String
)