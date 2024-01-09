package in.co.rays.basics;

public class NoteCountTest {
	public static void main(String[] args) {
		int number = 117083;
		int count = 0;
		int[] Notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < Notes.length; i++) {
			count = number / Notes[i];
			number = number % Notes[i];
			if (count > 0) {
				System.out.println(Notes[i] + "  " + count);
			}
		}
	}
}