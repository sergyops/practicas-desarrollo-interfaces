module com.sergyops.interfaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sergyops.userinterface to javafx.fxml;
    exports com.sergyops.userinterface;
}