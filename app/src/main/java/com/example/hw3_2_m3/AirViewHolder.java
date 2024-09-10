package com.example.hw3_2_m3;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw3_2_m3.databinding.ItemAirBinding;

public class AirViewHolder extends RecyclerView.ViewHolder {

    private ItemAirBinding binding;

    public AirViewHolder(ItemAirBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Air air) {
        binding.tvTitle.setText(air.getName());
        binding.tvDesc.setText(air.getDesc());
        Glide.with(binding.imgLogo).load(air.getLogo()).into(binding.imgLogo);
    }
}
