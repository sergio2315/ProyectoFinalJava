package com.example.proyectofinaljava.second_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.proyectofinaljava.databinding.AparmentListDataBinding;

import java.util.List;

public class AparmentAdapter extends RecyclerView.Adapter<AparmentAdapter.aparmentViewHolder>{
    private List<Apartment>apartmentList;
    private SendApartment sendApartment;

    public AparmentAdapter(List<Apartment>apartmentList,SendApartment sendApartment){
        this.apartmentList = apartmentList;
        this.sendApartment= sendApartment;
    }

    @NonNull
    @Override
    public aparmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AparmentListDataBinding binding = AparmentListDataBinding.inflate
                (LayoutInflater.from(parent.getContext()),parent,false);
        return new aparmentViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull aparmentViewHolder holder, int position) {
        Apartment apartmentList = this.apartmentList.get(position);
        holder.textView1.setText(apartmentList.getBuildingName());
        holder.textView2.setText(apartmentList.getProjectName());
        holder.textView3.setText(apartmentList.getUnitId());
        holder.textView4.setText(apartmentList.getAddress());
        Glide.with(holder.imageView.getContext())
                .load(apartmentList.getUrlImageBuilding()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return apartmentList.size();
    }

    public class aparmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;
        public TextView textView3;
        public TextView textView4;
        public aparmentViewHolder(@NonNull AparmentListDataBinding binding) {
            super(binding.getRoot());
            imageView = binding.deptoImage;
            textView1 = binding.txBuilding;
            textView2 = binding.txApartment;
            textView3 = binding.txProyect;
            textView4 = binding.txAddress;
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
           sendApartment.sendAparment(apartmentList.get(getLayoutPosition()));
        }
    }
    public interface SendApartment {
        void sendAparment(Apartment apartment);
    }
}
