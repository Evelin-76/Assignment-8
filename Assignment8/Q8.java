package Assignment8;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		fib(9);

	}

	public static void fib(int num) {

		int first = 0;
		int second = 1;
		int sum = 1;

		for (int i = 0; i < num; i++) {

			sum = first + second;
			first = second;
			second = sum;
		}
		System.out.println(num);
		System.out.println(sum);

	}
}
