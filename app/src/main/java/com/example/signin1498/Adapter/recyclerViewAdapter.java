package com.example.signin1498.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.signin1498.Models.Nature;
import com.example.signin1498.R;

import java.util.List;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewHolder> {

    List<Nature> list;
    Context context;
    public RecyclerViewItemClick rvItemClickInterface;

    public recyclerViewAdapter(List<Nature> list, Context context, RecyclerViewItemClick rvItemClickInterface) {
        this.list = list;
        this.context = context;
        this.rvItemClickInterface = rvItemClickInterface;
    }

    @NonNull
    @Override
    public recyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new recyclerViewHolder(view, rvItemClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewHolder holder, int position) {
        holder.tvName.setText(list.get(position).getName());
        holder.tvDesc.setText(list.get(position).getDesc());
        holder.imgvNature.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
