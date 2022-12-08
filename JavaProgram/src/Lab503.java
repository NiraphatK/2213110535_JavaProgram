import javax.swing.*;

public class Lab503 {
	static int inputyear;

	public static void main(String[] args) {
		inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		boolean chkyear = checkYear(inputyear);
		while (!checkYear(inputyear)) {
			inputyear = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-3000:" + "\nInput Year, again"));

		}
		/*
		 * if (isLeapYear(inputyear)) { JOptionPane.showMessageDialog(null, inputyear +
		 * " is Leap Year."); } else { JOptionPane.showMessageDialog(null, inputyear +
		 * " is NOT Leap Year."); }
		 */
		JOptionPane.showMessageDialog(null, inputyear + (isLeapYear(inputyear) ? " is " : " is NOT ") + "Leap Year.");

	}

	public static boolean checkYear(int year) {
		if (year >= 1000 && year <= 3000)
			return true;

		else
			return false;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0 || year % 400 == 0))) {
			return true;
		} else
			return false;
	}
}
