package comm.example.letter;

import java.util.Scanner;

public class Main {
	public static LetterSequence letterSequence;
	public static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		String string = null;
		System.out.println("Enter new string:\n");
		string = scanner.next();
		letterSequence = new LetterSequence(string);
		letterSequence.displayLetterFrequency(letterSequence.computeFrequency());
		scanner.close();
	}

}