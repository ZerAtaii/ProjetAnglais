package application.controller;

import java.io.IOException;

import application.Main;
import application.data.Data;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class EventController {
	@FXML ImageView img;
	@FXML TextArea title;
	@FXML TextArea text;
	@FXML ImageView cross;
	private Data data;
	
	public void setData(Data d) {
		this.data=d;
	}
	
	
	public void set(Image img,String title,String txt){
		this.title.setText(title);
		this.text.setText(txt);
		this.img.setImage(img);
	}
	
	@FXML private void exit() throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		stage = (Stage)cross.getScene().getWindow();
		fx.setLocation(Main.class.getResource("view/Timeline.fxml"));
		root = fx.load();
		TimelineController mc=fx.getController();
		mc.setData(data);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
