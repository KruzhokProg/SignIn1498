package com.example.signin1498;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.signin1498.Models.Nature;

public class DetailActivity extends AppCompatActivity {

    ImageView imgv;
    TextView tvName, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgv = findViewById(R.id.imgvDetail);
        tvName = findViewById(R.id.tvNameDetail);
        tvDesc = findViewById(R.id.tvDescDetail);

        Nature nature = getIntent().getParcelableExtra("data");

        imgv.setImageResource(nature.getImage());
        tvName.setText(nature.getName());
        tvDesc.setText(nature.getDesc());

//        imgv.setImageResource(getIntent().getExtras().getInt("img"));
//        tvName.setText(getIntent().getExtras().getString("name"));
//        tvDesc.setText(getIntent().getExtras().getString("desc"));
    }
}
