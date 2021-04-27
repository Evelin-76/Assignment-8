package Assignment8;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		cube();

	}
	public static void cube() {
		
		int userNum;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		userNum = scn.nextInt();
		
		int counter = userNum;
		
		for(int i = 1; i < 3; i++ ) {
			
			userNum = userNum * counter;
		}
		System.out.println(userNum);
	}
}
