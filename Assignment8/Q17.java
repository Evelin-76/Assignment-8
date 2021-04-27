package Assignment8;

public class Q17 {

	public static void main(String[] args) {
		
		getThunderBlazz(false, false, 3, 1, 2);

	}
	public static void getThunderBlazz(boolean isAvailable, boolean isGift, int ingredient1, int ingredient2,
			int ingredient3) {
		
		if(isAvailable || isGift ) {
			System.out.println(true);
		}else if(ingredient1 == 1 && ingredient2 == 2 && ingredient3 ==3) {
			System.out.println(true);
		}else if(ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
