import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Title : ");
		String title = scan.nextLine();
		System.out.print("Input PublishYear : ");
		int year = scan.nextInt();
		FictionBook book = new FictionBook(title, year);
		
		System.out.print("Input Name : ");
		String name = scan.nextLine();
		scan.nextLine();
		book.setAuthorName(name);
		System.out.print("Input Email : ");
		String email = scan.nextLine();
		book.setEmail(email);
		
		while(!book.checkFormatName() || !book.checkEmail()) {
			System.out.print("Input Name : ");
			name = scan.nextLine();
			book.setAuthorName(name);
			System.out.print("Input Email : ");
			email = scan.nextLine();
			book.setEmail(email);
		}
		if(book.checkEmail()&&book.checkFormatName()) {
			System.out.println(book);
		}
	}

}
