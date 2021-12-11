package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String question = JOptionPane.showInputDialog("How many minutes in one day?");
				String question2 = JOptionPane.showInputDialog("How many inches is one feet?");
				String question3 = JOptionPane.showInputDialog("How many hours in a year?");
				// 3.  Use an if statement to check if their answer is correct
				if (question.equalsIgnoreCase("1440")) {
					JOptionPane.showMessageDialog(null, "Great Job!");
					score = score + 1;
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect.");
					score = score - 1;
				}
				if (question2.equalsIgnoreCase("12")) {
					JOptionPane.showMessageDialog(null, "Good!");
					score = score + 1;
				}
				else {
					JOptionPane.showMessageDialog(null, "That is incorrect.");
					score = score -1;
				}
				if (question3.equalsIgnoreCase("8760")) {
					JOptionPane.showMessageDialog(parentComponent, message);
				}
					
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
					JOptionPane.showMessageDialog(null, "Nice Job! Your final score is " + score + "!");
		
	}
}
