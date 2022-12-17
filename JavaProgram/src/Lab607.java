import java.util.*;

public class Lab607 {
	static Scanner scan = new Scanner(System.in);
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	static int count[] = new int[12];

	public static void main(String[] args) {
		inputBirthDate();
	}

	public static void inputBirthDate() {
		int bmonth = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter BirthDate " + (i + 1) + " :");
			String input = scan.nextLine();
			bmonth = checkBirthDate(input);
			count[bmonth-1]++;
		} // end for
		displayCountBday(count);

	}

	public static int checkBirthDate(String bd) {
		//String[] dateParts = bd.split("-");
		//return Integer.parseInt(dateParts[1]) - 1;
		return Integer.parseInt(bd.substring(3, 5));

	}

	public static void displayCountBday(int[] count) {
		System.out.println();
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i] + "  [" + count[i] + " people]");

		}
	}
}
