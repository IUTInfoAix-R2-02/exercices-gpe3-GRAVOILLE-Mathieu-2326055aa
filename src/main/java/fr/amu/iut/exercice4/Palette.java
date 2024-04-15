package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root = new BorderPane();
        this.nbRouge =nbRouge;
        this.label=new Label();
        this.nbBleu=nbBleu;
        this.nbVert=nbVert;
        this.panneau=new Pane();
        this.bas=new HBox();
        this.bleu=new Button("Bleu");
        this.rouge=new Button("Rouge");
        this.vert=new Button("Vert");

        Label sp=new Label("  ");
        Label sp1=new Label("  ");
        HBox top = new HBox(label);
        VBox vb = new VBox();
        top.setAlignment(Pos.CENTER);

        root.setTop(top);
        root.setCenter(panneau);
        Label spv = new Label();
        Label spr=new Label();
        this.bas = new HBox(vert, sp, rouge, sp1, bleu);
        vb.getChildren().addAll(spr, bas, spv);
        bas.setAlignment(Pos.CENTER);
        root.setBottom(vb);
        bas.setAlignment(Pos.CENTER);

        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbVert=nbVert+1;
            panneau.setStyle("-fx-background-color: green");
            label.setText("Vert choisi "+nbVert+" fois");
        });

        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbBleu=nbBleu+1;
            panneau.setStyle("-fx-background-color: blue");
            label.setText("Bleu choisi "+nbBleu+" fois");
        });

        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbRouge=nbRouge+1;
            panneau.setStyle("-fx-background-color: red");
            label.setText("Rouge choisi "+nbRouge+" fois");
        });

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(200);
        primaryStage.setWidth(400);
        primaryStage.show();
    }
}
