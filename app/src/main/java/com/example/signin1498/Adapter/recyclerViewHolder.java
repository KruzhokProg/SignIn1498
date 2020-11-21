package com.example.signin1498.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.signin1498.R;

public class recyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView imgvNature;
    public TextView tvName, tvDesc;
    public RecyclerViewItemClick rvItemClickInterface;


    public recyclerViewHolder(@NonNull View itemView, RecyclerViewItemClick rvItemClickInterface) {
        super(itemView);

        this.rvItemClickInterface = rvItemClickInterface;

        imgvNature = itemView.findViewById(R.id.imgvPicture);
        tvName = itemView.findViewById(R.id.tvName);
        tvDesc = itemView.findViewById(R.id.tvDesc);
//        this.rvItemClickInterface = rvItemClickInterface;
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        rvItemClickInterface.onItemRVClick(getAdapterPosition());
    }
}
