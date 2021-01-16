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

public class LoginActivity extends AppCompatActivity implements IModelLogin {
    private ActivityLoginBinding binding;
    private PresenterLogin presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new PresenterLogin(this);

        binding.btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPassword();
            }
        });
    }
    @Override
    public void messageError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
    @Override
    public void blockButton(String colorButton) {
        binding.btnIn.setBackgroundColor(Color.parseColor(colorButton));
    }
    public void getPassword(){
        presenter.savePassword(binding.textPassword.getText().toString());
        binding.textPassword.setText("");
    }
    public void makeIntent(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
}