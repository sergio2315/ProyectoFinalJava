package com.example.proyectofinaljava.second_activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.proyectofinaljava.R;
import com.example.proyectofinaljava.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String url;

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
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        binding.txBuilding.setText(name1);
        binding.txProyect.setText(name2);
        binding.txAparment.setText(name3);
        binding.txAddress.setText(name4);
        Glide.with(getContext()).load(url).centerCrop().into(binding.deptoImage);
        return binding.getRoot();
    }
}