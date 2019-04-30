package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubleStack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			double randomValue = 0 + (100 - 0) * r.nextDouble();
			doubleStack.push(randomValue);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String inputRaw1 = JOptionPane.showInputDialog("Enter a random number between 1 and 100");
		String inputRaw2 = JOptionPane.showInputDialog("Enter a random number between 1 and 100");

		
		for(int i = 0; i < doubleStack.size(); i++){
			
				
			double input1 = Integer.parseInt(inputRaw1);
			double input2 = Integer.parseInt(inputRaw2);
			
				double currentVal = doubleStack.pop();
				
				if(input1<currentVal && currentVal<input2) {
					JOptionPane.showMessageDialog(null, "A pop was between your two numbers");
				}

			System.out.println(doubleStack.pop());
		}
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
