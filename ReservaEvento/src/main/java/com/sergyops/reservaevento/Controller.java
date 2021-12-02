package com.sergyops.reservaevento;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField nombre,apellido1,apellido2,empresa,email,nacomp;
    @FXML
    private TextArea observaciones;
    @FXML
    private Button reservar;


    //Con este método se comprueba todos los cuadros de texto
    public void checkText (ActionEvent event){

        //Comprobamos que todos los cuadros de texto no estén vacíos
        if(nombre.getText().isEmpty()){
            //Si está vacío se marca con color rojo
            nombre.setStyle("-fx-control-inner-background:#ef9a9a");
        }
        if(apellido1.getText().isEmpty()){
            apellido1.setStyle("-fx-control-inner-background:#ef9a9a");
        }
        if(apellido2.getText().isEmpty()){
            apellido2.setStyle("-fx-control-inner-background:#ef9a9a");
        }
        if(empresa.getText().isEmpty()){
            empresa.setStyle("-fx-control-inner-background:#ef9a9a");
        }
        if(email.getText().isEmpty()){
            email.setStyle("-fx-control-inner-background:#ef9a9a");
        }else{
            //Comprobamos el email com expresiones regulares
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.es]+$";
            String mail = email.getText();
            boolean resultado = mail.matches(regex);

            //Si el resultado da falso entonces se cambia el textfield a color rojo
            if(!resultado) {
                email.setStyle("-fx-control-inner-background:#ef9a9a");
            }
        }
        if(nacomp.getText().isEmpty()){
            nacomp.setStyle("-fx-control-inner-background:#ef9a9a");
        }
        if(observaciones.getText().isEmpty()){
            observaciones.setStyle("-fx-control-inner-background:#ef9a9a");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //inicializamos el evento
        reservar.setOnAction(this::checkText);

    }
}