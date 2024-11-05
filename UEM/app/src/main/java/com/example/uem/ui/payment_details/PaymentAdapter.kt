package com.example.uem.ui.payment_details


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uem.R

class PaymentAdapter(private val paylist: List<PaymentItem>) :
    RecyclerView.Adapter<PaymentAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val billNo: TextView = view.findViewById(R.id.bill_No)
        val billTotal: TextView = view.findViewById(R.id.bill_total)
        val billDate: TextView = view.findViewById(R.id.bill_date)
        val appCompatButton: Button = view.findViewById(R.id.bill_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.payment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val item = paylist[position]
        holder.billNo.text = item.bill_no
        holder.billTotal.text = item.bill_total.toString()
        holder.billDate.text = item.date
//        holder.appCompatButton.text = item.appCompatButton
    }

    override fun getItemCount(): Int{
        return paylist.size
    }
}