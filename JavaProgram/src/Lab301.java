import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int buffet = 299;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int customer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many customer per bill?"));
		double total = customer * buffet;
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null,
					"Total Price is " + frm.format(total) + " baht." + "\nDo you have a member card?");
		} while (member == 2);
		if (member == 0) {
			total = total * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(total) + " baht.");
		} else if (member == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(total) + " baht.");
		}

	}

}
