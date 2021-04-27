package Assignment8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		isEven(2);
	}

	public static void isEven(int even) {
		Scanner scn = new Scanner(System.in);
		System.out.println();
		even = scn.nextInt();
		if (even % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
