package com.example.uem.ui.due_pay_fees

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uem.R

class FeesAdapter(private val feesList: List<FeesItem>):
        RecyclerView.Adapter<FeesAdapter.ViewHolder>(){


    class ViewHolder(itemview: View) :RecyclerView.ViewHolder(itemview){
        val semTextView: TextView = itemview.findViewById(R.id.fees1)
        val semfeesTextView:TextView = itemview.findViewById(R.id.fees2)
        val hostelchargeTextView:TextView = itemview.findViewById(R.id.fees3)
        val cambridgeTextView:TextView = itemview.findViewById(R.id.fees3)
        val dueTextView:TextView = itemview.findViewById(R.id.fees3)
        val fineTextView:TextView = itemview.findViewById(R.id.fees3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fees_item, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = feesList[position]
        holder.semTextView.text = item.sem
        holder.semfeesTextView.text = item.semester_fees.toString()
        holder.hostelchargeTextView.text = item.hostel_charge.toString()
        holder.cambridgeTextView.text = item.cambridge_assessment.toString()
        holder.dueTextView.text = item.due_on
        holder.fineTextView.text = item.fine.toString()
    }


    override fun getItemCount(): Int {
        return feesList.size
    }
}