import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String fname = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+fname);
		

	}
	public static String abbreviatName(String fullname) {
		String fLetter = "";
		for (int i =0;i<fullname.length();i++) {
			if (fullname.charAt(i)==' ') {
				fLetter = (fLetter+fullname.charAt(i+1)).toUpperCase();
				fLetter = fLetter+".";
				
			}
		}
		return fLetter;
	}

}
