package Assignment8;

public class Q11 {

	public static void main(String[] args) {

		c_profit(10000, 10000);

	}

	public static void c_profit(double buyPrice, double sellPrice) {

		if (buyPrice < sellPrice) {

			System.out.println("profit");
		} else if (buyPrice == sellPrice) {

			System.out.println("no loss");
		} else {

			System.out.println("loss");
		}
	}
}
