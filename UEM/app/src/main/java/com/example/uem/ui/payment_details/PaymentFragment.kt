package com.example.uem.ui.payment_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uem.R
import com.example.uem.databinding.FragmentPaymentBinding

class PaymentFragment : Fragment() {

    private var _binding: FragmentPaymentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val paymentViewModel =
        ViewModelProvider(this).get(PaymentViewModel::class.java)







        val recyclerView:RecyclerView = findViewById()

        val layoutManager = LinearLayoutManager()
        recyclerView.layoutManager = layoutManager

        val jsonData= resources.openRawResource(R.raw.payment)

            .bufferedReader()
            .use { it.readText() }

        val list = parseJson(jsonData)

        val adapter = PaymentAdapter(list)
        recyclerView.adapter = adapter








        _binding = FragmentPaymentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.recyclerPayment
        val textView: TextView = binding.navPayment1
        val textView2: TextView = binding.navPayment2
        val textView3: TextView = binding.navPayment3
        val textView4: TextView = binding.navPayment4

        paymentViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }











    private fun LinearLayoutManager(): LinearLayoutManager {
        TODO("Not yet implemented")
    }


    private fun findViewById(): RecyclerView {
        TODO("Not yet implemented")
    }










    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun parseJson(jsonString: Any): List<PaymentItem>{

        val gson = Gson()

        val paymentData = gson.fromJson(jsonString, PaymentData::class.java)
        return paymentData.payment.bill
    }
}