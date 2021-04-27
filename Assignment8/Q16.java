package Assignment8;

public class Q16 {

	public static void main(String[] args) {
		
//All possibilities covered
		
		simpleBookroom(false, 7, 8, 2018);
		simpleBookroom(false, 7, 12, 2019);

	}

	public static void simpleBookroom(boolean isAvailable, int day, int month, int year) {

		if (day > 6 && day < 31 && month == 1 && year == 2018) {
			System.out.println(false);
		} else if (year > 2018 && month < 12) {
			System.out.println(true);
		} else if (day > 0 && day < 29 && month == 2 && year == 2018) {
			System.out.println(false);
		} else if (day > 0 && day < 32 && month == 3 || month == 5 || month > 6 && month <= 8 && year == 2018) {
			System.out.println(false);
		} else if (day > 0 && day < 31 && month == 4 || month == 6 && year == 2018) {
			System.out.println(false);
		} else if (day > 0 && day < 32 && month > 8 && month < 13 && day == 10 && year <= 2018) {
			System.out.println(false);
		} else if (month > 12) {

		} else {
			System.out.println(true);
		}

	}
}
