package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.stage.StageStyle;

import java.util.Random;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid);

        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        Label label9 = new Label();

        ImageView croix = new ImageView("exercice2/Croix.png");
        ImageView rond = new ImageView("exercice2/Rond.png");
        ImageView vide = new ImageView("exercice2/Vide.png");

        label.setGraphic(croix);
        label2.setGraphic(rond);
        label3.setGraphic(rond);
        label4.setGraphic(rond);
        label5.setGraphic(rond);
        label6.setGraphic(rond);
        label7.setGraphic(vide);
        label8.setGraphic(vide);
        label9.setGraphic(croix);

//        Random random = new Random();
//        int nombre = random.nextInt(3);


        grid.getChildren().addAll(label, label2, label3, label4, label5, label6, label7, label8, label9);
        GridPane.setConstraints(label, 0, 0);
        label.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label2, 1, 0);
        label2.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label3, 2, 0);
        label3.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label4, 0, 1);
        label4.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label5, 1, 1);
        label5.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label6, 2, 1);
        label6.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label7, 0, 2);
        label7.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label8, 1, 2);
        label8.setAlignment(Pos.CENTER);
        GridPane.setConstraints(label9, 2, 2);
        label9.setAlignment(Pos.CENTER);

        primaryStage.setTitle("Tic Tac Toe");
//        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

