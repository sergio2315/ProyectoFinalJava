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
            ,boolean btn4,boolean rbBtn1,boolean rbBtn2){
        model.checkOpcion(btn1,btn2,btn3,btn4,rbBtn1,rbBtn2);
        iSecondFrag.showResult(model.getResult());
        iSecondFrag.messageAlert(model.getMessage());
        iSecondFrag.save(model.getResult());
        if (model.isActiveAlert()==true){
            iSecondFrag.shareWithWsp(model.getMessageAlert());
        }else {
            iSecondFrag.messageAlert(model.getMessageAlert());
            iSecondFrag.blockButton(model.getColorBrutton());
        }
    }
}
