import java.util.Scanner;

public class BookDemo1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input author name  :");
		String name = scan.nextLine();
		System.out.print("Input author email :");
		String email = scan.nextLine();
		Author1 auth = new Author1(name, email);
		System.out.println();

		System.out.print("Input book title :");
		String bookTitle = scan.nextLine();
		System.out.print("Input book page  :");
		int bookPage = scan.nextInt();
		Book1 book1 = new Book1(bookTitle, auth, bookPage);	
		System.out.println();
		
		System.out.println(book1);
	}

}
