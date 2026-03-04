import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {   // <-- ton fichier principal

    @Override
    public void start(Stage primaryStage) {
        // Création d'un bouton
        Button btn = new Button("Clique moi !");
        btn.setOnAction(e -> System.out.println("Bonjour JavaFX !"));

        // Création du conteneur principal
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Création de la scène
        Scene scene = new Scene(root, 400, 300);

        // Configuration de la fenêtre
        primaryStage.setTitle("Projet JavaFX avec App.java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // lance l'application JavaFX
    }
}