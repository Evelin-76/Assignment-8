package Assignment8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		sign(1);
		
	}
	public static void sign(int signNumber) {
		
		if(signNumber > 0) {
			System.out.println("1");
		}else if(signNumber == 0) {
			System.out.println("0");
		}else {
			System.out.println("-1");
		}
		
	}
}
