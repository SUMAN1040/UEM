package com.example.uem.ui.exam_form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentExamBinding

class ExamFragment : Fragment() {

    private var _binding: FragmentExamBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val examViewModel =
            ViewModelProvider(this).get(ExamViewModel::class.java)

        _binding = FragmentExamBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val toolbar: androidx.appcompat.widget.Toolbar = binding.toolbar5
        val textView: TextView = binding.textView8
        val textView16: TextView = binding.textView16
        val textView20: TextView = binding.textView20
        val textView21: TextView = binding.textView21
        val textView23: TextView = binding.textView23
        val textView22: TextView = binding.textView22
        val textView25: TextView = binding.textView25
        val textView24: TextView = binding.textView24
        val textView26: TextView = binding.textView26
        val view: View = binding.view


        examViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}