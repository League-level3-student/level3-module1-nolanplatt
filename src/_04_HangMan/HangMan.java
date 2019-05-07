package _04_HangMan;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JFrame frame;
	JPanel panel;
	Utilities utl = new Utilities();
	Stack<String> words = new Stack<String>();
	String currentWord;
    JLabel label;

	HangMan() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		
	}
	void run() {
		String amountOfWordsString = JOptionPane.showInputDialog("How many words would you like to guess?");
		int amountOfWords = Integer.parseInt(amountOfWordsString);
		
		if(amountOfWords > 266) {
			JOptionPane.showMessageDialog(null, "The maximum value is 266");
		}
		else if(1 > amountOfWords) {
			JOptionPane.showMessageDialog(null, "The minimum value is 1");
		}
		else {
			
			for (int i = 0; i < amountOfWords; i++) {
				String word = readNextWord();
				words.push(word);
			}
			
			currentWord = getNextWord();
			int wordLength = currentWord.length();
			
			
		    ArrayList<JLabel> labels = new ArrayList<JLabel>(); 

		 
			for (int i = 0; i < wordLength; i++) {
				label = new JLabel();
				label.setText("_");
				panel.add(label);
			}
			
			
		}
		
	}
	
	String readNextWord() {
		String word = utl.readRandomLineFromFile("dictionary.txt");
		return word;
	}
	
	String getNextWord() {
		return words.pop();
	}
	
	
	
}
