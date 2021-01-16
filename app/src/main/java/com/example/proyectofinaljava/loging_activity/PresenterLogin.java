package com.example.proyectofinaljava.loging_activity;

public class PresenterLogin {
    private IModelLogin iModelLogin;
    private ModelLogin model;

    public PresenterLogin(IModelLogin iModelLogin) {
        this.iModelLogin = iModelLogin;
        this.model = new ModelLogin();
    }
    public void savePassword(String password){
        model.checkPassword(password);
        if (model.isActivateIn()==true){
            iModelLogin.makeIntent();
        }else {
            iModelLogin.blockButton(model.getColorButton());
            iModelLogin.messageError(model.getMessage());
        }
    }
}
