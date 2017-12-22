package application.controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import application.data.Data;

public class TimelineController {
	@FXML private ImageView timeline;
	@FXML private ImageView Back;
	@FXML private Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10;
	@FXML private ImageView quizButton;
	private Data data;
	
	
	public void setData(Data d) {
		this.data=d;
	}
	
	@FXML private void back() throws IOException {
		Stage stage;
		Parent root;
		stage = (Stage)Back.getScene().getWindow();
		FXMLLoader fx=new FXMLLoader();
		fx.setLocation(Main.class.getResource("view/Homepage.fxml"));
		root = fx.load();
		HomeController mc=fx.getController();
		mc.setData(data);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	@FXML private void but1() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img1, data.title1, data.text1);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML private void but2() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img2, data.title2, data.text2);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	
	@FXML private void but3() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img3, data.title3, data.text3);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	
	@FXML private void but4() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img4, data.title4, data.text4);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but5() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img5, data.title5, data.text5);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but6() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img6, data.title6, data.text6);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but7() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img7, data.title7, data.text7);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but8() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img8, data.title8, data.text8);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but9() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img9, data.title9, data.text9);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}

	@FXML private void but10() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)but1.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Event.fxml"));
		root = fx.load();
		EventController mc=fx.getController();
		mc.setData(data);
		mc.set(data.img10, data.title10, data.text10);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	
	@FXML private void goToQuiz() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx = new FXMLLoader();
		stage = (Stage)quizButton.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/quizView.fxml"));
		root = fx.load();
		QuizController quizController = fx.getController();
		quizController.setQuiz();
		quizController.setData(this.data,"Timeline",0);
		quizController.initializeTextAreas();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
}
