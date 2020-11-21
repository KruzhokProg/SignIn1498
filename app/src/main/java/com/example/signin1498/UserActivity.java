package com.example.signin1498;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.example.signin1498.Adapter.RecyclerViewItemClick;
import com.example.signin1498.Adapter.recyclerViewAdapter;
import com.example.signin1498.Models.Nature;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity implements RecyclerViewItemClick {

    TextView tvUserInfo;
    RecyclerView rv;
    ArrayList<Nature> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        tvUserInfo = findViewById(R.id.tv_user_data);
        rv = findViewById(R.id.rv);

        String email = getIntent().getExtras().getString("myExtraEmail");
        String pass = getIntent().getExtras().getString("myExtraPass");
        String role = getIntent().getExtras().getString("myExtraRole");

        tvUserInfo.setText(email + "\n\n" + role);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.welcome_anim);
        tvUserInfo.startAnimation(animation);

        data = new ArrayList<>();
        data.add(new Nature("car", "cool retro car", R.drawable.car));
        data.add(new Nature("guitar", "nature guitar", R.drawable.guitar));
        data.add(new Nature("moon", "violet moon", R.drawable.moon));
        data.add(new Nature("sunset", "finshing in sunset", R.drawable.sunset));
        data.add(new Nature("simpson", "gomer donut", R.drawable.simpson));

        recyclerViewAdapter adapter = new recyclerViewAdapter(data, this, this);
        rv.setAdapter(adapter);

    }

    @Override
    public void onItemRVClick(int position) {
//        Toast.makeText(this, "---> " + data.get(position).getName(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, DetailActivity.class);
//        i.putExtra("name", data.get(position).getName());
//        i.putExtra("desc", data.get(position).getDesc());
//        i.putExtra("img", data.get(position).getImage());
        i.putExtra("data", data.get(position));
        startActivity(i);
    }

    @Override
    public void onItemLongClick(int position) {

    }
}
