package com.example.uem.ui.set_my_password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val passwordViewModel =
            ViewModelProvider(this).get(PasswordViewModel::class.java)

        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.passchange1
        binding.passchange2
        binding.passchange3
        binding.passbtn

        passwordViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}