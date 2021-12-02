module com.sergyops.interfaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sergyops.ventanaemergente to javafx.fxml;
    exports com.sergyops.ventanaemergente;
}