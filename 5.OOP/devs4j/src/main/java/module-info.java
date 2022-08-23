module com.example.devs4j {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devs4j to javafx.fxml;
    exports com.example.devs4j;
}