package Assignment8;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		waterTax(0);

	}

	public static void waterTax(double tax) {
		double bill;

		Scanner scn = new Scanner(System.in);
		bill = scn.nextDouble();
		if (bill < 50) {
			tax = bill * 0.60;
			System.out.println(tax);
		} else if (bill >= 50 && bill <= 100) {
			tax = bill * 0.90;
			System.out.println(tax);
		} else if (bill > 100 && bill <= 150) {
			tax = (bill * 0.90) + 50;
			System.out.println(tax);
		} else if (bill > 150) {
			tax = (bill * 0.90) + 100;
			System.out.println(tax);
		}
	}
}
