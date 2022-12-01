import java.util.*;	
public class Example_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String txtinput ="";
		while (true) {
			System.out.print("Enter word : ");;
			input = scan.next();
			if (input.equalsIgnoreCase("stop")) {
				break;
			}
			txtinput += input+" ";
		}
		System.out.println(txtinput.toUpperCase());
	}

}
