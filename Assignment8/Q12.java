package Assignment8;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		hamletQuote("", "");

	}

	public static void hamletQuote(String word1, String word2) {

		String sentence = "To be or not to be that is the question.";

		Scanner scn = new Scanner(System.in);
		word1 = scn.next();
		word2 = scn.next();
		if (sentence.contains(word1) || sentence.contains(word2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
