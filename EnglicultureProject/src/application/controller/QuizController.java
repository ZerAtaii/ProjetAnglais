package application.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import application.Main;
import application.data.CivilWarQuiz;
import application.data.Data;
import application.data.Quiz;
import application.data.QuizQuestion;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class QuizController {
	
	@FXML private TextArea question, answer;
	private Quiz quiz, britishEmpireQuiz;
	private Data data;
	@FXML private Button back;
	@FXML private ToggleButton validate;
	@FXML private Label score;
	@FXML private RadioButton rb1,rb2,rb3;
	@FXML private ToggleGroup toggleGroup;
	private int index=0;
	private int i;
	private CivilWarQuiz civilWarQuiz = new CivilWarQuiz();
	private String comefrom;

	
	public void setData(Data d,String s,int i) {
		this.data=d;
		this.comefrom=s;
		this.i=i;
	}
	
	public void setQuiz() {
	
		QuizQuestion quizQuestion = civilWarQuiz.createAQuestion("test", "test", "testf", "testfa");
		QuizQuestion quizQuestion2 = civilWarQuiz.createAQuestion("test2", "test2", "test2k", "test2ng");
		List<QuizQuestion> testQuiz = new ArrayList<QuizQuestion>();
		testQuiz.add(quizQuestion);
		testQuiz.add(quizQuestion2);
		QuizQuestion questionOneBritish = civilWarQuiz.createAQuestion("testBritish", "testc", "kkkkk", "g");
		QuizQuestion question2British = civilWarQuiz.createAQuestion("Construis", "ta maison", "en palettes", "c'est pas cher!");
		List<QuizQuestion> testQuizBritish = new ArrayList<QuizQuestion>();
		testQuizBritish.add(questionOneBritish);
		testQuizBritish.add(question2British);
		this.quiz=new Quiz(testQuiz);
		this.britishEmpireQuiz = new Quiz(testQuizBritish);
	}
	
	
	@FXML public void back() throws IOException {
		Stage stage;
		Parent root;
		stage = (Stage)back.getScene().getWindow();
		FXMLLoader fx=new FXMLLoader();
		fx.setLocation(Main.class.getResource("view/"+comefrom+".fxml"));
		root = fx.load();
		if (comefrom.equals("Timeline")) {
			TimelineController mc=fx.getController();
			mc.setData(data);
		}
		else if(comefrom.equals("BritishTimeline")) {
			BritishTimelineController mc=fx.getController();
			mc.setData(data,i);
		}	
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	
	@FXML public void checkAnswer() {
		String picked = ((Labeled) toggleGroup.getSelectedToggle()).getText();
		if (picked == this.quiz.getCorrectAnswer(index) || picked == this.britishEmpireQuiz.getCorrectAnswer(index)) {
			this.data.score=this.data.score+10;
			this.score.setText("Score: "+this.data.score);
			answer.setText("Correct answer, nice job!");
		}
		else {
			if (comefrom.equals("Timeline")) {
				answer.setText("Wrong answer, the correct answer was: \n"+this.quiz.getCorrectAnswer(index));
			}
			else if (comefrom.equals("BritishTimeline")) {
				answer.setText("Wrong answer, the correct answer was: \n"+this.britishEmpireQuiz.getCorrectAnswer(index));
			}
		}
		validate.setDisable(true);
	}
	
	@FXML public void initializeTextAreas() {
		if (comefrom.equals("Timeline")) {
			rb1.setText(quiz.getAllAnswers(index)[0]);
			rb2.setText(quiz.getAllAnswers(index)[1]);
			rb3.setText(quiz.getAllAnswers(index)[2]);
			question.setText(quiz.getQuestion(index));
		}
		else if (comefrom.equals("BritishTimeline")) {
			rb1.setText(britishEmpireQuiz.getAllAnswers(index)[0]);
			rb2.setText(britishEmpireQuiz.getAllAnswers(index)[1]);
			rb3.setText(britishEmpireQuiz.getAllAnswers(index)[2]);
			question.setText(britishEmpireQuiz.getQuestion(index));
		}
	}
	@FXML public void goToNextQuestion() throws IOException {
		if (comefrom.equals("Timeline")) {
			if (index < this.quiz.getQuizSize()) {
				answer.setText(null);
				index++;
				rb1.setText(quiz.getAllAnswers(index)[0]);
				rb2.setText(quiz.getAllAnswers(index)[1]);
				rb3.setText(quiz.getAllAnswers(index)[2]);
				question.setText(quiz.getQuestion(index));
				validate.setSelected(false);
				validate.setDisable(false);
			}
			else {
				throw new IOException();
			}
		}
		else if (comefrom.equals("BritishTimeline")) {
			if (index < this.britishEmpireQuiz.getQuizSize()) {
				answer.setText(null);
				index++;
				rb1.setText(britishEmpireQuiz.getAllAnswers(index)[0]);
				rb2.setText(britishEmpireQuiz.getAllAnswers(index)[1]);
				rb3.setText(britishEmpireQuiz.getAllAnswers(index)[2]);
				question.setText(britishEmpireQuiz.getQuestion(index));
				validate.setSelected(false);
				validate.setDisable(false);
			}
			else {
				throw new IOException();
			}
		}
	
	}

}
