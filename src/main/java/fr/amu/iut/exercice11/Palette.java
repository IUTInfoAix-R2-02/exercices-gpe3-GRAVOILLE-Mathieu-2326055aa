package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label texteDuHaut;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;


    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        VBox bas = new VBox();
        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));
        texteDuBas = new Label();
        bas.setAlignment(Pos.CENTER_RIGHT);
        bas.getChildren().addAll(boutons, texteDuBas);

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");

        /* VOTRE CODE ICI */
        IntegerProperty nbFois = new SimpleIntegerProperty();
        StringProperty message = new SimpleStringProperty();
        StringProperty couleurPanneau = new SimpleStringProperty("#000000");

        private void createBindings(message, nbFois, couleurPanneau){
//            BooleanProperty pasEncoreDeClic;
            texteDuHaut.textProperty().bind(Bindings.concat(message, " choisi ", nbFois, " fois"));
            panneau.styleProperty().bind(Bindings.concat("-fx-background-color: ", couleurPanneau));
        }

        vert.setOnAction(event -> {
            nbVert++;
//            panneau.setStyle("-fx-background-color: green");
            nbFois.setValue(nbVert);
            message.setValue("vert");
            couleurPanneau.setValue("#28B463");
//            texteDuHaut.setText(message.getValue()+" choisi "+nbFois.getValue()+" fois");
        });
        rouge.setOnAction(event -> {
            nbRouge++;
//            panneau.setStyle("-fx-background-color: red");
            nbFois.setValue(nbRouge);
            message.setValue("rouge");
            couleurPanneau.setValue("#C70039");
//            texteDuHaut.setText(message.getValue()+" choisi "+nbFois.getValue()+" fois");
        });
        bleu.setOnAction(event -> {
            nbBleu++;
//            panneau.setStyle("-fx-background-color: blue");
            nbFois.setValue(nbBleu);
            message.setValue("bleu");
            couleurPanneau.setValue("#2e86c1");
//            texteDuHaut.setText(message.getValue()+" choisi "+nbFois.getValue()+" fois");
        });

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

