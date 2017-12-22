package application.data;

import java.util.List;

public class QuizQuestion {
	
	private String correctAnswer;
	private String[] allAnswers;
	private String question;
	
	public QuizQuestion(List<String> list) {
		
		this.question = list.get(0); //1st element of the list in parameter is always the question
		this.correctAnswer = list.get(1); //Same for corrct answer, always 2nd element in "list"
		
		this.allAnswers = new String[list.size()-1];
		
		int correctAnswerLocation = (int)(Math.random()*this.allAnswers.length); //Changing randomly the location of the correct answer in the list of answers
		int otherQuestionLocation = 2; //Start index of all the other (wrong) answers in list
		
		for (int i=0; i<this.allAnswers.length; i++) {
			if (i == correctAnswerLocation) {
				this.allAnswers[i] = this.correctAnswer;
			}
			else {
				this.allAnswers[i] = list.get(otherQuestionLocation);
				otherQuestionLocation++;
			}
		}
			
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public String getCorrectAnswer() {
		return this.correctAnswer;
	}
	
	public String[] getAllAnswers() {
		return this.allAnswers;
	}

}
