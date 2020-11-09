package com.example.signin1498;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.signin1498.Adapter.recyclerViewAdapter;
import com.example.signin1498.Models.Nature;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    TextView tvUserInfo;
    RecyclerView rv;

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

        ArrayList<Nature> data = new ArrayList<>();
        data.add(new Nature("car", "cool retro car", R.drawable.car));
        data.add(new Nature("guitar", "nature guitar", R.drawable.guitar));
        data.add(new Nature("moon", "violet moon", R.drawable.moon));
        data.add(new Nature("sunset", "finshing in sunset", R.drawable.sunset));
        data.add(new Nature("simpson", "gomer donut", R.drawable.simpson));

        recyclerViewAdapter adapter = new recyclerViewAdapter(data, this);
        rv.setAdapter(adapter);

    }
}
