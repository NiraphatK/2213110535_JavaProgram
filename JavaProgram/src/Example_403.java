import java.util.*;
import javax.swing.*;
public class Example_403 {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String input = scan.nextLine();
		while (!input.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			input = scan.nextLine();
		}
		System.out.println();
		int count = 0;
		for (int i = 0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("This sentence has "+count+" spacebar.");
		System.out.println("This sentence has "+(count+1)+" word.");
		*/
		String input = JOptionPane.showInputDialog("Input a sentence:");
		while (!input.endsWith(".")) {
			JOptionPane.showInputDialog("Input a sentence, again:");
		}
		System.out.println();
		int count = 0;
		for (int i = 0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				count++;	
			}
		}
		JOptionPane.showMessageDialog(null, 
				"This sentence has "+count+" spacebar."+
		"\nThis sentence has "+(count+1)+" word.");
		
	}
}
