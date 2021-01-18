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
    private String colorBrutton = "#E80B0B";
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

    public void checkOpcion(boolean btn1, boolean btn2, boolean btn3, boolean btn4
            , boolean rbBtn1, boolean rbBtn2){

        if (btn1==true) {
            pointBtn1 = 10;
        } else {
            pointBtn1 = 0;
        }
        if (btn2==true) {
            pointBtn2 = 40;
        } else {
            pointBtn2 = 0;
        }
        if (btn3==true) {
            pointBtn3 = 30;
        } else {
            pointBtn3 = 0;
        }
        if (btn4==true) {
            pointBtn4 = 20;
        } else {
            pointBtn4 = 0;
        }
        if (rbBtn1==true) {
            pointRdBtn = 3;
        } else if (rbBtn2==true){
            pointRdBtn = 2;
        }else {
            pointRdBtn = 1;
        }
        result = (pointBtn1+pointBtn2+pointBtn3+pointBtn4)*pointRdBtn;
    }
    public void activateAlert(){
        if (result<130){
            message = "Envie una alerta por bajo puntaje ";
            messageAlert = "Esto es un mensaje de alerta!";
            activeAlert = true;
        }else {
            colorBrutton = "#676666";
            message = "Seleccione guardar";
            messageAlert = "No puede enviar una alerta";
            activeAlert = false;
        }
    }
}
