package com.example.uem.ui.digital_library_resources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentDigitalBinding

class DigitalFragment : Fragment() {

    private var _binding: FragmentDigitalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val digitalViewModel =
            ViewModelProvider(this).get(DigitalViewModel::class.java)

        _binding = FragmentDigitalBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.digital11
        binding.digital1
        binding.digital2
        binding.digital3
        binding.digital4
        binding.digital5
        binding.digital6
        binding.digital7

        digitalViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}