package com.example.proyectofinaljava.second_activity;

import android.graphics.Color;
import android.widget.Toast;

import com.example.proyectofinaljava.R;

public class ModelSecondFrag {
    private int pointBtn1;
    private int pointBtn2;
    private int pointBtn3;
    private int pointBtn4;
    private int pointRdBtn;
    private int result;
    private String colorBrutton;
    private String message;
    private String messageAlert;
    private boolean activeAlert;

    public String getMessage() {
        return message;
    }
    public String getMessageAlert() {
        return messageAlert;
    }

    public int getResult() {
        return result;
    }
    public String getColorBrutton() {
        return colorBrutton;
    }

    public boolean isActiveAlert() {
        return activeAlert;
    }

    public void checkOpcion(boolean btn1,boolean btn2,boolean btn3
            ,boolean btn4,boolean rdBtn1,boolean rdBtn2,boolean rdBtn3) {
        if (btn1 == true) {
            pointBtn1 = 10;
        } else {
            pointBtn1 = 0;
        }
        if (btn2 == true) {
            pointBtn2 = 40;
        } else {
            pointBtn2 = 0;
        }
        if (btn3 == true) {
            pointBtn3 = 30;
        } else {
            pointBtn3 = 0;
        }
        if (btn4 == true) {
            pointBtn4 = 20;
        } else {
            pointBtn4 = 0;
        }
        if (rdBtn1 == true) {
            pointRdBtn = 3;
        }
        if (rdBtn2 == true) {
            pointRdBtn = 2;
        }
        if(rdBtn3 == true) {
            pointRdBtn = 1;
        }
        result = (pointBtn1 + pointBtn2 + pointBtn3 + pointBtn4) * pointRdBtn;
        if (result<130){
            message = "Envie una alerta por bajo puntaje ";
            colorBrutton = "#E80B0B";
            activeAlert = true;
            messageAlert = "Esto es un mensaje de alerta!";
        }else {
            message = "Seleccione guardar";
            colorBrutton = "#676666";
            activeAlert = false;
            messageAlert = "No puede enviar una alerta";
        }
    }
   /* public void activateAlert(int result){
        if (result<130){
            message = "Envie una alerta por bajo puntaje ";
            colorBrutton = "#E80B0B";
            *//*Toast.makeText(getContext(),"Envie una alerta por bajo puntaje ",Toast.LENGTH_SHORT).show();
            binding.btnAlert.setBackgroundColor(Color.parseColor("#E80B0B"));
            activeAlert = true;*//*
        }else {
            message = "Seleccione guardar";
            colorBrutton = "#676666";
            *//*Toast.makeText(getContext(),"Seleccione guardar",Toast.LENGTH_SHORT).show();
            binding.btnAlert.setBackgroundColor(Color.parseColor("#676666"));
            activeAlert = false;*//*
        }
    }*/
}
