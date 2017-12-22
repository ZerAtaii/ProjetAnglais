package application.data;

import java.util.ArrayList;
import java.util.List;

public class CivilWarQuiz {
	
	public QuizQuestion createAQuestion(String question, String correctAnswer, String answer2, String answer3) {
		
		List<String> test = new ArrayList<String>();
		test.add(question);
		test.add(correctAnswer);
		test.add(answer2);
		test.add(answer3);
		return new QuizQuestion(test);
		
		
	}
	


}
