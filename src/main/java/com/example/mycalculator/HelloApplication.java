    package com.example.mycalculator;

    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Scene;
    import javafx.stage.Stage;

    import java.io.IOException;

    public class HelloApplication extends Application {

        public static void main(String[] args) {
            launch();
        }
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CalculatorDesign.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 520, 640);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }


    }