package application;
	
import java.io.IOException;

import application.controller.HomeController;
import application.data.Data;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage stage;
	private BorderPane mainView;

	public void start(Stage primaryStage) throws IOException {
		this.stage=primaryStage;
		this.stage.setTitle("English History");
		FXMLLoader fx=new FXMLLoader();
		fx.setLocation(Main.class.getResource("view/Homepage.fxml"));
		this.mainView=fx.load();
		HomeController mc=fx.getController();

		Scene s=new Scene(mainView);
		Data data=new Data();
		mc.setData(data);
		stage.setScene(s);
		stage.setResizable(false);
		stage.show();

	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}
