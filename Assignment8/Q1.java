package Assignment8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		plus();

	}

	public static void plus() {
		int num1;
		int num2;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		int sum = num1 + num2;

		System.out.println(sum);
	}

}
