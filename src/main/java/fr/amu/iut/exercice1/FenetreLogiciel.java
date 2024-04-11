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
        llabel.setAlignment(Pos.CENTER);

        //Bar menu haut
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu help = new Menu("Help");
        MenuBar top = new MenuBar(file, edit, help);

        //page
        HBox center2 = new HBox(b4, b5);
        VBox left1 = new VBox(l4, b1, b2, b3);
        Separator s1 = new Separator(Orientation.VERTICAL);
        HBox left2 = new HBox(left1, s1);
        left1.setAlignment(Pos.CENTER);
//        VBox login = new VBox(name, l9, email, l10, password, l11, center2);
//        login.setAlignment(Pos.CENTER_RIGHT);

        //scène
        GridPane gp1 = new GridPane();
        gp1.getChildren().addAll(lname, tfname, lemail, tfemail, lpw, tfpw, center2);
        GridPane.setConstraints(lname, 0, 0);
        GridPane.setConstraints(tfname, 1, 0);
        GridPane.setConstraints(lemail, 0, 1);
        GridPane.setConstraints(tfemail, 1, 1);
        GridPane.setConstraints(lpw, 0, 2);
        GridPane.setConstraints(tfpw, 1, 2);
        GridPane.setConstraints(center2, 1, 3);
        gp1.setVgap(10);
        gp1.setHgap(10);
        gp1.setAlignment(Pos.CENTER);

        BorderPane bp1 = new BorderPane();
        bp1.setLeft(left2); //boutons à gauche
        bp1.setCenter(gp1); //page de login au centre
        bp1.setBottom(llabel); //pied de page
        bp1.setTop(top); //en-tete
        Scene sc1 = new Scene(bp1, 600, 400);//v = hauteur et v1 = largeur
        primaryStage.setScene(sc1);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

