package com.company.SudokuJava;

import jdk.jfr.internal.jfc.model.UserInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;
import javafx.application.Application;
import javafx.fxml.FMXLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


@SpringBootApplication
public class SudokuJavaApplication extends Application {

	private IUserInterfaceContract.View uiImpl;

	@Override
	public void start(Stage primaryStage) throws Exception{
		uiImpl = new UserInterfaceImpl(primaryStage);
		try {
			SudokuBuildLogic.build(uiImpl);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}

