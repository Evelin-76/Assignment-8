package Assignment8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		next3(1);

	}

	public static void next3(int num) {
		Scanner scn = new Scanner(System.in);

		System.out.println("enter number: \n" + num);
		System.out.println("next 3 are:");
		for (int i = 0; i <= 2; i++) {

			num += 1;
			System.out.print(num + " ");
		}

	}
}
