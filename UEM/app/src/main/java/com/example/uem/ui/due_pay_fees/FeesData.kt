package com.example.uem.ui.due_pay_fees


data class FeesData(val fees:Fees)

data class Fees(
    val semesters: List<FeesItem>
)

data class FeesItem(
    val sem: String,
    val semester_fees: Double,
    val bus_fare: Double,
    val hostel_charge: Double,
    val cambridge_assessment: Double,
    val due_on: String,
    val fine: Double
)