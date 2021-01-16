package com.example.proyectofinaljava.loging_activity;

import android.graphics.Color;

public class ModelLogin {
    private String passwordConfirm="123Pass";
    private String colorButton="#1E8022";
    private String message;
    private int countPass = 0;
    private boolean activateIn;
    private String password ="";

    public String getColorButton() {
        return colorButton;
    }
    public String getMessage() {
        return message;
    }
    public boolean isActivateIn() {
        return activateIn;
    }

    public void checkPassword(String password){
        if (password.equals(passwordConfirm)&&countPass<3){
            activateIn = true;
        }else {
            countPass += 1;
            message = "Contraseña incorrecta, intento "+countPass+" de 3";
        }
        if (countPass>=3){
            colorButton = "#676666";
            message = "Reinicie App para volver a intentarlo";
            activateIn = false;
        }
    }
}