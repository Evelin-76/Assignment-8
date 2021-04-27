package Assignment8;

public class Q14 {

	public static void main(String[] args) {
		tableTruth(true, true, false);

	}

	public static void tableTruth(boolean a, boolean b, boolean c) {

		if (a == true && a == b || c == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
