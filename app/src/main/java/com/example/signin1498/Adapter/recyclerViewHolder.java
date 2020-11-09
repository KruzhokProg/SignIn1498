package com.example.signin1498.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.signin1498.R;

public class recyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView imgvNature;
    TextView tvName, tvDesc;


    public recyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        imgvNature = itemView.findViewById(R.id.imgvPicture);
        tvName = itemView.findViewById(R.id.tvName);
        tvDesc = itemView.findViewById(R.id.tvDesc);
    }
}
