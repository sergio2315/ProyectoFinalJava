package com.example.proyectofinaljava.loging_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.proyectofinaljava.R;
import com.example.proyectofinaljava.databinding.ActivityLoginBinding;
import com.example.proyectofinaljava.second_activity.FirstFragment;
import com.example.proyectofinaljava.second_activity.SecondActivity;
import com.example.proyectofinaljava.second_activity.SecondFragment;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeIntent();
            }
        });
    }
    private void makeIntent(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
}