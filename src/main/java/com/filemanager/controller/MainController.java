package com.filemanager.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable{

    @FXML
    private Label labelId;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelId.setText("asfasffsa");
    }



}
