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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomeController {
	
	@FXML private ImageView theme1, theme2, theme3;
	private Data data;
	
	public void setData(Data d) {
		this.data=d;
	}
	
	@FXML private void goToTheme(MouseEvent e) throws IOException {
		Stage stage;
		Parent root;
		FXMLLoader fx=new FXMLLoader();
		if (e.getSource()==(ImageView)theme1) {
			stage = (Stage)theme1.getScene().getWindow();
			fx.setLocation(Main.class.getResource("view/Timeline.fxml"));
			root = fx.load();
			TimelineController mc=fx.getController();
			mc.setData(data);
		
		
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.centerOnScreen();

		}
		else if (e.getSource()==(ImageView)theme2) {
			stage = (Stage)theme2.getScene().getWindow();
			fx.setLocation(Main.class.getResource("view/BritishTimeline.fxml"));
			root = fx.load();
			BritishTimelineController mc=fx.getController();
			mc.setData(data,0);
		
		
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.centerOnScreen();

		}
		else if (e.getSource()==theme3) {
			stage = (Stage)theme3.getScene().getWindow();
			fx.setLocation(Main.class.getResource("view/BritishTimeline.fxml"));
			root = fx.load();
			BritishTimelineController mc=fx.getController();
			mc.setData(data,0);
		
		
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.centerOnScreen();

		}
		

		
	}

}
