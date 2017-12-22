package application.controller;

import java.io.IOException;

import application.Main;
import application.data.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {
	@FXML ImageView timeline;
	@FXML TextArea txtA;
	@FXML ImageView img;
	private Data data;
	@FXML private Button back;
	
	@FXML private void goBackToThemeSelection(ActionEvent e) throws IOException {
		Stage stage;
		Parent root;
		stage = (Stage)back.getScene().getWindow();
		FXMLLoader fx=new FXMLLoader();
		fx.setLocation(Main.class.getResource("view/Homepage.fxml"));
		root = fx.load();
		HomeController mc=fx.getController();
		mc.setData(data);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void setData(Data d) {
		this.data=d;
	}
	
	@FXML private void but1() {
		this.img.setImage(data.img0);
		txtA.setText(data.text1+"\n");;
	}
	@FXML private void but2() {
		this.img.setImage(data.img1);
		txtA.setText(data.text2);
	}
	@FXML private void but3() {
		this.img.setImage(data.img1);
		txtA.setText(data.text3);
	}
	@FXML private void but4() {
		this.img.setImage(data.img1);
		txtA.setText(data.text4);
	}
	
	
	
	
	
	
	
}
