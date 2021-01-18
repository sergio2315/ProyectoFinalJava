package com.example.proyectofinaljava.second_activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.service.autofill.OnClickAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.proyectofinaljava.R;
import com.example.proyectofinaljava.databinding.FragmentSecondBinding;
import com.google.android.material.chip.ChipGroup;

public class SecondFragment extends Fragment implements ISecondFrag{
    private FragmentSecondBinding binding;
    private PresentSecondFrag present;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String url;
    private int result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        present = new PresentSecondFrag(this);
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
        boolean btn1 = binding.btn1.isChecked();
        boolean btn2 = binding.btn2.isChecked();
        boolean btn3 = binding.btn3.isChecked();
        boolean btn4 = binding.btn4.isChecked();
        boolean rdBtn1 = binding.rdBtn1.isChecked();
        boolean rdBtn2 = binding.rdBtn2.isChecked();
        boolean rdBtn3 = binding.rdBtn3.isChecked();
        present.saveCheckButton(btn1,btn2,btn3,btn4,rdBtn1,rdBtn2,rdBtn3);
    }
    @Override
    public void showResult(int result) {
        binding.txResult.setText(getString(R.string.result, String.valueOf(result)));
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"El puntaje es: "+result,Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void activateAlert(String message,String colorBtn) {
        Toast.makeText(getContext(),message,Toast.LENGTH_SHORT).show();
        binding.btnAlert.setBackgroundColor(Color.parseColor(colorBtn));
    }
    public void shareWithWsp(String messageAlert){
        binding.btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, messageAlert);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}