module com.sergyops.reservaevento {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sergyops.reservaevento to javafx.fxml;
    exports com.sergyops.reservaevento;
}