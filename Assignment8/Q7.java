package Assignment8;

public class Q7 {

	public static void main(String[] args) {
		
			isPalindrome(123124);
			
	}

		
		public static void isPalindrome(int num) {
		
			int firstNum = num, reverse = 0, remind;
			System.out.println(firstNum);
			while(num > 0) {
				remind = num % 10;
				reverse = reverse * 10 + remind;
				num /= 10;
				}
			System.out.println(reverse);
			if(reverse == firstNum) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			}
		
	
}
