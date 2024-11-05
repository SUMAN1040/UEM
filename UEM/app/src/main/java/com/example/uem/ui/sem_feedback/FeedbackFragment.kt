package com.example.uem.ui.sem_feedback

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.uem.databinding.FragmentFeedbackBinding

class FeedbackFragment : Fragment() {

    private var _binding: FragmentFeedbackBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val feedbackViewModel =
            ViewModelProvider(this).get(FeedbackViewModel::class.java)

        _binding = FragmentFeedbackBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val toolbar: androidx.appcompat.widget.Toolbar = binding.toolbar3
        val textView: TextView = binding.textView28

        feedbackViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}