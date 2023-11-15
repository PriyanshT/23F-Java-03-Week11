package com.georgiancollege.week11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Movie> listView;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button getDetailsButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorLabel.setVisible(false);
        getDetailsButton.setVisible(false);
        listView.getSelectionModel().selectedItemProperty().addListener(
                ((observableValue, oldMovie, newMovie) -> {
                    getDetailsButton.setVisible(true);
                    try {
                        imageView.setImage(new Image(newMovie.getPoster()));
                    } catch (Exception e){
                        imageView.setImage(new Image("https://www.pngplay.com/wp-content/uploads/12/Bugs-Bunny-No-PNG-Photo-Image.png"));
                    }
                })
        );
    }

    @FXML
    void showMovies(ActionEvent event) {
        listView.getItems().clear();
        String searchString = searchTextField.getText();

        // create apiResponse object
        ApiResponse apiResponse = ApiUtility.getDataFromAPIQuick(searchString);

        // add movie objects to listView
        if(apiResponse.getMovie() == null){
            errorLabel.setVisible(true);
            errorLabel.setText("No Movies Found!");
        } else {
            errorLabel.setVisible(false);
            listView.getItems().addAll(apiResponse.getMovie());
        }
    }

    @FXML
    void getDetailsButton_onClick(ActionEvent event) throws IOException {
        String selectedID = listView.getSelectionModel().getSelectedItem().getImdbID();
        System.out.println("Selected Movie ID (From First Scene): " + selectedID);

        SceneChanger.changeScene(event, "movie-details-view.fxml", "Movie Details", selectedID);
    }
}
