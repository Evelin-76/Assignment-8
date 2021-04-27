package Assignment8;

public class Q15 {

	public static void main(String[] args) {

		validateTask(false, 5, 6);

	}

	public static void validateTask(boolean isEmpty, int taskId, int currentId) {

		if (taskId - 1 == currentId) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
