package com.example.cafe_companion.ui.cabinet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cafe_companion.databinding.FragmentCabinetBinding

class CabinetFragment : Fragment() {

    private var _binding: FragmentCabinetBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val cabinetViewModel =
            ViewModelProvider(this).get(CabinetViewModel::class.java)

        _binding = FragmentCabinetBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.recyclerView.adapter = CabinetAdapter(emptyList())

        cabinetViewModel.teaList.observe(viewLifecycleOwner) {
            (binding.recyclerView.adapter as CabinetAdapter).update(it)
        }

        cabinetViewModel.loadData()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}