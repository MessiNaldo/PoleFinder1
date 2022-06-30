package com.jmy.polefinder1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jmy.polefinder1.databinding.ItemPolelistBinding

class CustomAdapter: RecyclerView.Adapter<Holder>() {
    var listData = mutableListOf<Pole>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemPolelistBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val pole = listData.get(position)
        holder.setPole(pole)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class Holder(val binding: ItemPolelistBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setPole(pole: Pole){
        binding.imagePole.setImageResource(pole.poleImage)
        binding.textPoleName.text = pole.poleName
        binding.textPoleAddress.text = pole.poleAddress
        binding.textPoleIntroduction.text = pole.poleIntroduction
        binding.textPoleDistance.text = pole.poleDistance
    }
}