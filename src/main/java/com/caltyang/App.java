package com.caltyang;

import javax.sound.midi.Soundbank;
import javax.swing.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("abc");

        Button button = new Button("hello world");
        button.setOnAction(this);

        ProgressBar progress = new ProgressBar(20);

//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);

        Line line = new Line();
        line.setStartX(20);
        line.setStartY(100);

        line.setEndX(150);
        line.setEndY(100);
        Group group = new Group(line);

        Scene scene = new Scene(group, 300, 300);
        scene.setFill(Color.BROWN);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void handle(ActionEvent event) {
        System.out.println("hello world");

    }
}
