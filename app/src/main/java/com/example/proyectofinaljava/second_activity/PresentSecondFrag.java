package com.example.proyectofinaljava.second_activity;

import android.graphics.ColorSpace;

public class PresentSecondFrag {
    private ISecondFrag iSecondFrag;
    private ModelSecondFrag model;

    public PresentSecondFrag(ISecondFrag iSecondFrag) {
        this.iSecondFrag = iSecondFrag;
        this.model = new ModelSecondFrag();
    }
    public void saveCheckButton(boolean btn1,boolean btn2,boolean btn3
            ,boolean btn4,boolean rdBtn1,boolean rdBtn2,boolean rdBtn3){
        model.checkOpcion(btn1,btn2,btn3,btn4,rdBtn1,rdBtn2,rdBtn3);
        iSecondFrag.showResult(model.getResult());
        iSecondFrag.activateAlert(model.getMessage(),model.getColorBrutton());
        if (model.isActiveAlert() == true){
            iSecondFrag.shareWithWsp(model.getMessageAlert());
        }
    }
}
