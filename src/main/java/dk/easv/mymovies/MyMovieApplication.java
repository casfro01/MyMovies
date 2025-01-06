package dk.easv.mymovies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyMovieApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyMovieApplication.class.getResource("MyMovie-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1660, 1000);
        stage.setTitle("MyMovies");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}