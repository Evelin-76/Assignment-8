package Assignment8;

public class Q4 {

	public static void main(String[] args) {
		
		printHollowRect();

	}
	public static void printHollowRect() {
		
		for(int i = 0; i < 1; i++) {
			
			System.out.println("*****");
			
			for(int j = i; j <= 2; j++) {
			
			System.out.println("*   *");
			
			for(int a = 1; a < j; a++) {
				
				System.out.println("*****");
			}
			}
		}
	}
}
