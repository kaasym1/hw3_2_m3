package com.example.hw3_2_m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_2_m3.databinding.ItemAirBinding;

import java.util.ArrayList;


public class AirAdapter extends RecyclerView.Adapter<AirViewHolder> {

    private ArrayList<Air> airs;

    public AirAdapter(ArrayList<Air> cars) {
        this.airs = cars;
    }

    @NonNull
    @Override
    public AirViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AirViewHolder(ItemAirBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AirViewHolder holder, int position) {
        holder.bind(airs.get(position));
    }

    @Override
    public int getItemCount() {
        return airs.size();
    }
}
