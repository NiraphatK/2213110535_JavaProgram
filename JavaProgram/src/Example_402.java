import javax.swing.*;

public class Example_402 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input your e-mail:");
		while (input.startsWith("@") || input.contains(" ")) {
			input = JOptionPane.showInputDialog("Input your e-mail,again:");

		}
		input = input.toLowerCase();
		boolean check = input.endsWith("@gmail.com") || input.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(check) ? "Your e-mail is " + input : "Your e-mail is not hotmail or gmail dot com");

		/*
		 * if(input.endsWith("@gmail.com") || input.endsWith("@hotmail.com")) {
		 * JOptionPane.showMessageDialog(null, "Your e-mail is "+input); } else {
		 * JOptionPane.showMessageDialog(null,
		 * "Your e-mail is not hotmail or gmail dot com "); }
		 */
	}

}
