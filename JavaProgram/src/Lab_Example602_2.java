import javax.swing.JOptionPane;

public class Lab_Example602_2 {
	static boolean chk = false;

	public static void main(String[] args) {
		String[] deptName = { "Accounting", "HR", "Sales", "Innovation" };
		;

		String name = JOptionPane.showInputDialog("Enter a department name");
		for (int i = 0; i < deptName.length; i++) {
			if (name.equalsIgnoreCase(deptName[i])) {
				chk = true;

			}
		}
		JOptionPane.showMessageDialog(null,
				(chk) ? name + " was found in the list" : name + " was not found in the list");

	}

}
