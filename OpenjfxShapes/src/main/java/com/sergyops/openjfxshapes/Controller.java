package com.sergyops.openjfxshapes;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    private Polygon pentagon;
    @FXML
    private Rectangle rectangle;
    @FXML
    private Line line1, line2, line3;


    @FXML
    public void initialize() {
        //===================== Grupo figuras =====================


        //Puntos del pentágono para que forme la figura
        pentagon.getPoints().setAll(
                200.0, 300.0,
                300.0, 600.0,
                700.0, 600.0,
                800.0, 300.0,
                500.0, 100.0
        );

        //Rotación del rectángulo
        rectangle.setRotate(45);

        //===================== Grupo Lineas =====================


        //Posición de las líneas de arriba a abajo
        line1.setStartY(-100);
        line1.setEndY(-100);

        line2.setStartY(-70);
        line2.setEndY(-70);

        line3.setStartY(-40);
        line3.setEndY(-40);

        //grosor de las líneas
        line1.setStrokeWidth(10);
        line2.setStrokeWidth(20);
        line3.setStrokeWidth(30);

        //color de las líneas
        line1.setStroke(Color.YELLOW);
        line2.setStroke(Color.AQUA);
        line3.setStroke(Color.CORAL);
    }
}