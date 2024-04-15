package fr.amu.iut.exercice1;

//imports de classes
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1

        //boutons
        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");
        Button b4 = new Button("Submit");
        Button b5 = new Button("Cancel");

        Label l1 = new Label("  ");
        Label l2 = new Label(" ");

        Label spc = new Label(" ");
        Label spc1 = new Label(" ");
        Label spc2 = new Label(" ");

        //Name
        Label lname = new Label("Name:");
        TextField tfname = new TextField(" ");
//        HBox name = new HBox(l1, tf1);

        //Email
        Label lemail = new Label("Email:");
        TextField tfemail = new TextField(" ");
//        HBox email = new HBox(l2, tf2);

        //Password
        Label lpw = new Label("Password:");
        TextField tfpw = new TextField(" ");
//        HBox password = new HBox(l3, tf3);

        //labels d'espacements
        Label l4 = new Label("Boutons : ");

        //label de bas de page
        Label label = new Label("Ceci est un label de bas de page");
        HBox llabel = new HBox(label);
        Separator sp = new Separator(Orientation.HORIZONTAL);
        llabel.setAlignment(Pos.CENTER);
        VBox bdp = new VBox(sp, llabel);

        //Bar menu haut
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu help = new Menu("Help");
        MenuBar top = new MenuBar(file, edit, help);

        //page
        HBox center2 = new HBox(b4, l1, b5);
        center2.setAlignment(Pos.CENTER);
        VBox left1 = new VBox(l4, spc, b1, spc1, b2, spc2, b3);
        Separator s1 = new Separator(Orientation.VERTICAL);
        HBox left2 = new HBox(left1, s1);
        left1.setAlignment(Pos.CENTER);
//        VBox login = new VBox(name, l9, email, l10, password, l11, center2);
//        login.setAlignment(Pos.CENTER_RIGHT);

        //scène
        GridPane gp1 = new GridPane();
        gp1.getChildren().addAll(lname, tfname, lemail, tfemail, lpw, tfpw);
        GridPane.setConstraints(lname, 0, 0);
        GridPane.setConstraints(tfname, 1, 0);
        GridPane.setConstraints(lemail, 0, 1);
        GridPane.setConstraints(tfemail, 1, 1);
        GridPane.setConstraints(lpw, 0, 2);
        GridPane.setConstraints(tfpw, 1, 2);
        gp1.setVgap(10);
        gp1.setHgap(10);
        gp1.setAlignment(Pos.CENTER);

        VBox vb = new VBox(gp1, l2, center2);
        vb.setAlignment(Pos.CENTER);

        BorderPane bp1 = new BorderPane();
        bp1.setLeft(left2); //boutons à gauche
        bp1.setCenter(vb); //page de login au centre
        bp1.setBottom(bdp); //pied de page
        bp1.setTop(top); //en-tete
        Scene sc1 = new Scene(bp1);
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);
        primaryStage.setScene(sc1);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

