package com.example.uem.ui.due_pay_fees

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentFeesBinding

class FeesFragment : Fragment() {

    private var _binding: FragmentFeesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val feesViewModel =
            ViewModelProvider(this).get(FeesViewModel::class.java)


















        _binding = FragmentFeesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.recyclerfees
        val textView: TextView = binding.fees1
        val textView2: TextView = binding.fees2
        val textView3: TextView = binding.fees3
        val textView4: TextView = binding.fees4
        val textView5: TextView = binding.fees5
        val textView6: TextView = binding.fees6

        feesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}