package com.example.uem.ui.university_marks_system

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentMarksBinding

class MarksFragment : Fragment() {

    private var _binding: FragmentMarksBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val marksViewModel =
            ViewModelProvider(this).get(MarksViewModel::class.java)

        _binding = FragmentMarksBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val toolbar4: androidx.appcompat.widget.Toolbar = binding.toolbar4
        val textView: TextView = binding.textView9
        val textView10: TextView = binding.textView10
        val textView11: TextView = binding.textView11
        val textView12: TextView = binding.textView12
        val textView13: TextView = binding.textView13
        val textView14: TextView = binding.textView14
        val textView15: TextView = binding.textView15
        val textView17: TextView = binding.textView17
        val textView18: TextView = binding.textView18
        val textView19: TextView = binding.textView19


        marksViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}