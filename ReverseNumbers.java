class ReverseNumbers {

	private void reverseNumberNonRecursive(int numberToReverse) {
		// Nothing to be done for single digit number
		if (numberToReverse < 10)
		{
			System.out.println("Reversed number is " + numberToReverse);
			return;
		}
		//  Print out all the digits in reverse order
		while (numberToReverse > 0)
		{
			// Print out the remainder, for example  7532%10 == 2
			System.out.print(numberToReverse%10);
			// "Shift" the number to right, for example, 7532/10 == 753
			numberToReverse = numberToReverse/10;

			// NB! Repeat the statements above until the number is all printed reversed
			// For example:
			// print 2 and new numberToReverse is 753
			// print 3 and new numberToReverse is 75
			// print 5 and new numberToReverse is 7
			// print 7 and new numberToReverse is 0
			// while loop stops since the condition (numberToRevers > 0) does not hold anymore
		}
	}

	private void reverseNumberRecursive(int numberToReverse) {
		if (numberToReverse < 10) {
			System.out.print(numberToReverse);
		}
		else {
			System.out.print(numberToReverse%10);
			reverseNumberRecursive(numberToReverse/10);
		}
	}

	public static void main(String[] args) {
		ReverseNumbers reverser = new ReverseNumbers();
		int numberFromUserInput = 13579; // This could be read from user input
		System.out.println("Reversing " + numberFromUserInput);
		// Notice the \n, this makes a line change in output
		System.out.println("\nNon-recursive");
		reverser.reverseNumberNonRecursive(numberFromUserInput);
		System.out.println("\n\nRecursive");
		reverser.reverseNumberRecursive(numberFromUserInput);

		// Just the get the command line promt on next line after program ends
		System.out.println("");
	}

}
