package com.example.proyectofinaljava.loging_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.proyectofinaljava.R;
import com.example.proyectofinaljava.databinding.ActivityLoginBinding;
import com.example.proyectofinaljava.second_activity.FirstFragment;
import com.example.proyectofinaljava.second_activity.SecondActivity;
import com.example.proyectofinaljava.second_activity.SecondFragment;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    private String password="123Pass";
    private String passScreen;
    private int countPass = 0;
    private boolean activateIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPassword(password);
            }
        });
    }
    private void makeIntent(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
    private void checkPassword(String password){
        passScreen = binding.textPassword.getText().toString();
        if (passScreen.equals(password)&&countPass<3){
            makeIntent();
        }else {
            countPass += 1;
            Toast.makeText(this, "Contraseña incorrecta, intento "+countPass, Toast.LENGTH_SHORT).show();
        }
        if (countPass>=3){
            binding.btnIn.setBackgroundColor(Color.parseColor("#676666"));
            Toast.makeText(this, "Reinicie App para volver a intentarlo", Toast.LENGTH_LONG).show();
        }
    }
}