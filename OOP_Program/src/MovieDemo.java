import java.util.Scanner;

public class MovieDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Input movie id   : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char dGender = scan.next().toLowerCase().charAt(0);
		while(dGender!='m'&& dGender!='f') {
			System.out.print("Input director gender, again : ");
			dGender = scan.next().toLowerCase().charAt(0);
		}
		
		System.out.println();
		
		System.out.print("Input movie theater no.  : ");
		int theaterNo = scan.nextInt();
		while (!(theaterNo>=1&&theaterNo<=15)) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(id,name,new Director(dName, dEmail,dGender),theaterNo);
		
		System.out.println(theater);
	}

}
