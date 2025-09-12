package basiccalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 332, 545);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("/assets/calculator.png").toExternalForm()));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}