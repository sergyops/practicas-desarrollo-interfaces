module com.sergyops.openjfxshapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sergyops.openjfxshapes to javafx.fxml;
    exports com.sergyops.openjfxshapes;
}