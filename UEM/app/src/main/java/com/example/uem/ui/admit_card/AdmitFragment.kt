package com.example.uem.ui.admit_card

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentAdmitBinding

class AdmitFragment : Fragment() {

    private var _binding: FragmentAdmitBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val admitViewModel =
            ViewModelProvider(this).get(AdmitViewModel::class.java)

        _binding = FragmentAdmitBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val toolbar: androidx.appcompat.widget.Toolbar = binding.toolbar6
        val textView: TextView = binding.textView27
        val button: androidx.appcompat.widget.AppCompatButton = binding.button2


        admitViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}