package fr.amu.iut.exercice7;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CounterController implements Initializable {

    int counter = 0;

    @FXML
    BorderPane counterPane;
    @FXML
    HBox counterBox;
    @FXML
    VBox counterVBox;
    @FXML
    Label counterLabel = new Label("0");

    public void increment() {
        counter++;
        counterLabel = new Label(String.valueOf(counter));
    }

    public void decrement() {
        counter--;
        counterLabel = new Label(String.valueOf(counter));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing CounterController...");
   }
}
