package com.example.proyectofinaljava.second_activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.proyectofinaljava.R;
import com.example.proyectofinaljava.databinding.FragmentSecondBinding;

public interface ISecondFrag {
    void showResult(int result);
    void activateAlert(String message,String colorBtn);
}
/*
public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String url;
    private int pointBtn1;
    private int pointBtn2;
    private int pointBtn3;
    private int pointBtn4;
    private int pointRdBtn;
    private int result;
    private boolean activeAlert;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name1 = getArguments().getString("name1");
            name2 = getArguments().getString("name2");
            name3 = getArguments().getString("name3");
            name4 = getArguments().getString("name4");
            url = getArguments().getString("url");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        binding.txResult.setText(getString(R.string.result, "0"));
        binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkOpcion();
                activateAlert();
            }
        });
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"el puntaje es: "+result,Toast.LENGTH_SHORT).show();
            }
        });
        binding.btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAlert();
            }
        });
        binding.txBuilding.setText(name1);
        binding.txProyect.setText(name2);
        binding.txAparment.setText(name3);
        binding.txAddress.setText(name4);
        Glide.with(getContext()).load(url).centerCrop().into(binding.deptoImage);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    public void checkOpcion(){
        if (binding.btn1.isChecked()) {
            pointBtn1 = 10;
        } else {
            pointBtn1 = 0;
        }
        if (binding.btn2.isChecked()) {
            pointBtn2 = 40;
        } else {
            pointBtn2 = 0;
        }
        if (binding.btn3.isChecked()) {
            pointBtn3 = 30;
        } else {
            pointBtn3 = 0;
        }
        if (binding.btn4.isChecked()) {
            pointBtn4 = 20;
        } else {
            pointBtn4 = 0;
        }
        if (binding.rdBtn1.isChecked()) {
            pointRdBtn = 3;
        } else if (binding.rdBtn2.isChecked()){
            pointRdBtn = 2;
        }else {
            pointRdBtn = 1;
        }
        result = (pointBtn1+pointBtn2+pointBtn3+pointBtn4)*pointRdBtn;
        binding.txResult.setText(getString(R.string.result, String.valueOf(result)));
    }
    public void activateAlert(){
        if (result<130){
            Toast.makeText(getContext(),"Envie una alerta por bajo puntaje ",Toast.LENGTH_SHORT).show();
            binding.btnAlert.setBackgroundColor(Color.parseColor("#E80B0B"));
            activeAlert = true;
        }else {
            Toast.makeText(getContext(),"Seleccione guardar",Toast.LENGTH_SHORT).show();
            binding.btnAlert.setBackgroundColor(Color.parseColor("#676666"));
            activeAlert = false;
        }
    }
    public void sendAlert(){
        if (activeAlert==true){
            shareWithWsp("Esto es un mensaje de alerta!");
        }else {
            Toast.makeText(getContext(),"No puede enviar una alerta",Toast.LENGTH_SHORT).show();
        }
    }
    public void shareWithWsp(String message){
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}*/
