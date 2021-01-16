package com.example.proyectofinaljava.loging_activity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelLoginTest {
    private ModelLogin model;

    @Before
    public void setUp() throws Exception {
        model = new ModelLogin();
    }
    @Test
    public void getColorButton() {
        //give
        String pass = "123Pass";
        //when
        model.checkPassword(pass);
        //then
        assertEquals("#E80B0B",model.getColorButton());
    }
    @Test
    public void getMessage() {
        //give
        String pass = "123as";
        //when
        model.checkPassword(pass);
        model.checkPassword(pass);
        model.checkPassword(pass);
        model.checkPassword(pass);
        //then
        assertEquals("Reinicie App para volver a intentarlo",model.getMessage());
    }

    @Test
    public void isActivateIn() {
        //give
        String pass = "123Pss";
        //when
        model.checkPassword(pass);
        //model.checkPassword(pass);
        //model.checkPassword(pass);
        //model.checkPassword(pass);
        //then
        assertEquals(false,model.isActivateIn());
    }
}