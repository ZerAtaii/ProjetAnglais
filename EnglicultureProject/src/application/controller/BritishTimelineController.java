package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.Main;
import application.data.Data;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BritishTimelineController {
	@FXML private ImageView map;
	@FXML private ImageView Back;
	@FXML private AnchorPane pane;
	private Data data=new Data();
	private ArrayList<String> date=new ArrayList<String>();
	@FXML private ImageView quizButton;
	private int i;
	
	public BritishTimelineController() {
		super();
		this.date.add("1660");
		this.date.add("1754");
		this.date.add("1822");
		this.date.add("1885");
		this.date.add("1914");
		this.date.add("1919");
		this.date.add("1938");
		this.date.add("1945");
		this.date.add("1959");
		this.date.add("1974");
		this.date.add("2007");
	}
	
	public void setData(Data d, int i) {
		this.data=d;
		this.i=i;
		this.map.setImage(new Image("resources/images/British_Empire/"+date.get(i)+".png"));
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
	
	@FXML private void left() {
		i--;
		if (i<0) {
			i=10;
		}
		map.setImage(new Image("resources/images/British_Empire/"+date.get(i)+".png"));
		
		
	}
	
	@FXML private void right() {
		i++;
		if (i>10) {
			i=0;
		}
		map.setImage(new Image("resources/images/British_Empire/"+date.get(i)+".png"));
		
		
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
		quizController.setData(this.data,"BritishTimeline",i);
		quizController.initializeTextAreas();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	
	@FXML private void map() {
	}
}
