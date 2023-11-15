module com.georgiancollege.week11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens com.georgiancollege.week11 to javafx.fxml, com.google.gson;
    exports com.georgiancollege.week11;
    exports com.georgiancollege.week11.Controllers;
    opens com.georgiancollege.week11.Controllers to com.google.gson, javafx.fxml;
    exports com.georgiancollege.week11.Utilities;
    opens com.georgiancollege.week11.Utilities to com.google.gson, javafx.fxml;
    exports com.georgiancollege.week11.Models;
    opens com.georgiancollege.week11.Models to com.google.gson, javafx.fxml;
}