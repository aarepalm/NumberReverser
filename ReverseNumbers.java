class ReverseNumbers {

	///////////////////////
	//////////// Solution 1
	public void reverseNumberNonRecursive(int numberToReverse) {
		do {
			// Print out the remainder, for example  7532%10 == 2
			System.out.print(numberToReverse%10);
			// "Shift" the number to right (or chop off the rightmost digit), for example, 7532/10 == 753
			numberToReverse = numberToReverse/10;

			// NB! Repeat the statements above until the number is all printed reversed
			// For example:
			// print 2 and new numberToReverse is 753
			// print 3 and new numberToReverse is 75
			// print 5 and new numberToReverse is 7
			// print 7 and new numberToReverse is 0
			// while loop stops since the condition (numberToRevers > 0) does not hold anymore
		} while (numberToReverse > 0);
	}

	///////////////////////
	//////////// Solution 2
	public void reverseNumberRecursive(int numberToReverse) {
		// "Shift" the number to right (or chop off the rightmost digit), for example, 7532/10 == 753
		System.out.print(numberToReverse%10);
			// If the numberToReverse has more than one digit then chop off the single (and making the
			// the number one digit shorter) and call the same function again.
			// Note that when we are calling the function with last digit, the 7 in our example, it is printed
			// and the recursion stops.
		if (numberToReverse > 9)
			// Note that the stringLength is first decremented and the then new value is used in the expression
				reverseNumberRecursive(numberToReverse/10);
	}

	///////////////////////
	//////////// Solution 3
	public void reverseNumberWithStringConversion(int numberToReverse) {
			// Convert the numberToReverse to String so we could index all characters individually
		String intAsString = Integer.toString(numberToReverse);
		int stringLength = intAsString.length();
		while (stringLength != 0) {
			System.out.print(intAsString.charAt(--stringLength));
		}
	}

	///////////////////////
	//////////// Solution 4
	public static void reverseNumberRecursiveStatic(int numberToReverse) {
		System.out.print(numberToReverse%10);
		if (numberToReverse > 9)
				reverseNumberRecursiveStatic(numberToReverse/10);
	}

	///////////////////////
	//////////// Solution 5
	public void reverseNumberWithStringBuilder(int numberToReverse) {
		StringBuilder sb = new StringBuilder(Integer.toString(numberToReverse));
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		int numberFromUserInput = 13579; // This could be read from user input

		System.out.println("Reversing " + numberFromUserInput + " with static method");
		ReverseNumbers.reverseNumberRecursiveStatic(numberFromUserInput);

		ReverseNumbers reverser = new ReverseNumbers();
		System.out.println("\n ---------- Reversing a number that is at least 2 digits ----------------");
		System.out.println("Reversing " + numberFromUserInput);
		// Notice the \n, this makes a line change in output
		System.out.println("\nNon-recursive");
		reverser.reverseNumberNonRecursive(numberFromUserInput);
		System.out.println("\nRecursive");
		reverser.reverseNumberRecursive(numberFromUserInput);
		System.out.println("\nConverting to string");
		reverser.reverseNumberWithStringConversion(numberFromUserInput);
		System.out.println("\nConverting to StringBuilder");
		reverser.reverseNumberWithStringBuilder(numberFromUserInput);

		/////////////////////////////////////////////////////////////////////////////////
		//////// This section is just for testing that all works with number 0
		numberFromUserInput = 0;
		System.out.println("\n\n ---------- Reversing a 0 (must not crash :-) ---------------------------");
		System.out.println("Reversing " + numberFromUserInput);
		// Notice the \n, this makes a line change in output
		System.out.println("\nNon-recursive");
		reverser.reverseNumberNonRecursive(numberFromUserInput);
		System.out.println("\nRecursive");
		reverser.reverseNumberRecursive(numberFromUserInput);
		System.out.println("\nConverting to string");
		reverser.reverseNumberWithStringConversion(numberFromUserInput);
		System.out.println("\nConverting to StringBuilder");
		reverser.reverseNumberWithStringBuilder(numberFromUserInput);

		/////////////////////////////////////////////////////////////////////////////////
		//////// This section is just for testing that all works with single-digit numbers
		numberFromUserInput = 4;
		System.out.println("\n\n ---------- Reversing a single digit number (must not crash :-) --------");
		System.out.println("Reversing " + numberFromUserInput);
		// Notice the \n, this makes a line change in output
		System.out.println("\nNon-recursive");
		reverser.reverseNumberNonRecursive(numberFromUserInput);
		System.out.println("\nRecursive");
		reverser.reverseNumberRecursive(numberFromUserInput);
		System.out.println("\nConverting to string");
		reverser.reverseNumberWithStringConversion(numberFromUserInput);
		System.out.println("\nConverting to StringBuilder");
		reverser.reverseNumberWithStringBuilder(numberFromUserInput);

		// Just the get the command line promt on next line after program ends
		System.out.println("");
	}

}
