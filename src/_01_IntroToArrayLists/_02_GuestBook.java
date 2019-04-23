package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringJoiner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JPanel panel;
	JButton buttonAddName;
	JButton buttonViewNames;
	ArrayList<String> names = new ArrayList<String>();

	_02_GuestBook() {

		frame = new JFrame();
		panel = new JPanel();
		buttonAddName = new JButton();
		buttonViewNames = new JButton();
		
		frame.add(panel);
		panel.add(buttonViewNames);
		panel.add(buttonAddName);
		buttonViewNames.setText("View Names");
		buttonAddName.setText("Add Name");
		panel.setVisible(true);
		frame.setVisible(true);
		buttonViewNames.setVisible(true);
		buttonAddName.setVisible(true);
		buttonViewNames.addActionListener(this);
		buttonAddName.addActionListener(this);
		frame.setTitle("Guest Book");
		frame.pack();
	}
	public static void main(String[] args) {
		_02_GuestBook guestBook = new _02_GuestBook();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    JButton buttonPressed = (JButton) e.getSource(); 
	    
	    
	    if(buttonPressed == buttonAddName) {
	    	System.out.println("Add name clicked");
	    	String addNameInput = JOptionPane.showInputDialog("Please enter a name to add to the Guest List.");
	    	names.add(addNameInput);
	    	JOptionPane.showMessageDialog(frame, "Succesfully added "+addNameInput + " to the Guest List.");
	    	System.out.println(names);
	    	
	    } else if(buttonPressed == buttonViewNames) {
	    	System.out.println("View names clicked");
	    	StringJoiner joinedNames = new StringJoiner(" ");
			for (int i = 0; i < names.size(); i++) {
				String currentString = names.get(i);
				int currentElementConverted = i + 1;
	    		joinedNames.add("\nGuest #" +  currentElementConverted + ": " + currentString + "\n");
			}
	    	
	    	String namesSpaceSeparated = joinedNames.toString();
	    	
				
			
	    	JOptionPane.showMessageDialog(frame, "Current Guest Book:\n" + namesSpaceSeparated);
	    	System.out.println(namesSpaceSeparated);
	    	
	    }

		
	}

	
}
