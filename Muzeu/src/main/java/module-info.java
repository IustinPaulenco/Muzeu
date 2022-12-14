module com.example.muzeu {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.muzeu to javafx.fxml;
    exports com.example.muzeu;
}