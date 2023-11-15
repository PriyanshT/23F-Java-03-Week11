package com.georgiancollege.week11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class MovieDetailsController {

    @FXML
    private ListView<?> actorsListView;

    @FXML
    private Label directorLabel;

    @FXML
    private Label genreLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label movieNameLabel;

    @FXML
    private ListView<?> ratingsListView;

    @FXML
    private Label releasedDateLabel;

    @FXML
    private Label runtimeLabel;

    @FXML
    private Label writerLabel;

    @FXML
    private Label yearLabel;

    @FXML
    void goBackButton_onClick(ActionEvent event) {

    }

}
