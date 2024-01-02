package com.example.cafe_companion.ui.cabinet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cafe_companion.R
import com.example.cafe_companion.classes.Tea

class CabinetAdapter(private var _dataSet: List<Tea>) :
    RecyclerView.Adapter<CabinetAdapter.CabinetViewHolder>() {

    fun update(dataSet: List<Tea>) {
        _dataSet = dataSet
        notifyDataSetChanged()
    }

    class CabinetViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.text_view_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CabinetViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_cabinet, parent, false)
        return CabinetViewHolder(view)
    }

    override fun onBindViewHolder(holder: CabinetViewHolder, position: Int) {
        holder.textView.text = _dataSet[position].name
    }

    override fun getItemCount(): Int {
        return _dataSet.size
    }
}