package com.sergyops.ventanaemergente;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label guardado;


    @FXML
    protected void onButtonClick() {

        //Mensaje a través de texto
        guardado.setText("Información guardada");


        //Mensaje a través de ventana emergente
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Guardado");
        a.setContentText("La información se ha guardado");
        a.show();
    }
}