import java.util.Scanner;

public class BookDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book b = new Book();
		System.out.print("Input book title   : ");
		b.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		b.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b.setPublishyear(scan.nextInt());
		System.out.println(b);
		

	}

}
