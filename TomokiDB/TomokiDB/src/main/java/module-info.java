module com.luxgrey {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.luxgrey to javafx.fxml;
    exports com.luxgrey;
}