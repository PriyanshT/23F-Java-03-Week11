module com.georgiancollege.week11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens com.georgiancollege.week11 to javafx.fxml, com.google.gson;
    exports com.georgiancollege.week11;
}