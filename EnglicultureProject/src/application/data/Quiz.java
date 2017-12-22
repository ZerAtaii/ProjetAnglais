package application.data;

import java.util.List;

public class Quiz {
	
	private List<QuizQuestion> quiz;
	private int quizSize;
	
	public Quiz(List<QuizQuestion> quiz) {
		this.quiz = quiz;
		this.quizSize = quiz.size()-1;
	}
	
	//Getting the question which index in the list of QuizQuestion is quizQuestionIndex
	public String getQuestion(int quizQuestionIndex) {
		return this.quiz.get(quizQuestionIndex).getQuestion(); 
	}
	
	//Same but for the correct answer
	public String getCorrectAnswer(int quizQuestionIndex) {
		return this.quiz.get(quizQuestionIndex).getCorrectAnswer();
	}
	
	//Same but for all answers (correct answer included)
	public String[] getAllAnswers(int quizQuestionIndex) {
		return this.quiz.get(quizQuestionIndex).getAllAnswers();
	}
	
	//Getting the quiz size
	public int getQuizSize() {
		return this.quizSize;
	}
	
	//Method to add a QuizQuestion to the quiz
	public void addAQuizQuestion(QuizQuestion question) {
		this.quiz.add(question);
	}
	
	//Method to remove a QuizQuestion from the quiz (if necessary)
	public void removeAQuizQuestion(QuizQuestion question) {
		this.quiz.remove(question);
	}
	//Same function but using the index of the question instead of the question itself
	public void removeAQuizQuestionUsingIndex(int indexOfQuizQuestion) {
		this.quiz.remove(indexOfQuizQuestion);
	}

}
