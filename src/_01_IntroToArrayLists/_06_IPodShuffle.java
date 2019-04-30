package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button;
	
	ArrayList<String> songs = new ArrayList<String>();
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			
		songs.add("demo.mp3");
		songs.add("groove.mp3");
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		button.setText("Suprise Me!");
		button.addActionListener(this);
		frame.pack();
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked, playing random song...");
		Random r = new Random();
		int randomIndex = r.nextInt(2);
		String nameOfRandomSong = songs.get(randomIndex);
		Song songClass = new Song(nameOfRandomSong);	
		songClass.play();
		
	}
}