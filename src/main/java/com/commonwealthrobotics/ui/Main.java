package com.commonwealthrobotics.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {

	public static void main(String[] args) {
		System.out.println("BowlerGame Main");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Main.fxml"));
		Parent root = loader.load(); 
		primaryStage.setTitle("Bowler Game");
		primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            System.out.println("Bowler Game is closing");
            System.exit(0);
        });
	}
}
