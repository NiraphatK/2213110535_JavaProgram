import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String input = scan.nextLine();
		while (!input.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			input = scan.nextLine();
		}
		System.out.println();
		int txt = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				System.out.println(input.substring(txt, i));
				txt = i + 1;

			}

		}
		System.out.println(input.substring(txt));

	}

}
