module com.example.agencycode {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.agencycode to javafx.fxml;
    exports com.example.agencycode;
}