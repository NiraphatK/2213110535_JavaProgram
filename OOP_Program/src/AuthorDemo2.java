import java.util.Scanner;

public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		  Author[] a = new Author[4];
		  for(int i=0;i<a.length;i++) {
			  System.out.println("Information Author "+(i+1));
			  System.out.println("------------------------------------------------");
			  System.out.print("Input author name  : ");
			  String name = scan.nextLine(); 
			  System.out.print("Input author email  : ");
			  String email = scan.nextLine(); 
			  System.out.println("------------------------------------------------");
			  a[i] = new Author(name,email);
			  
		  }
		  System.out.println();
		  int i=1;
		  for (Author _a: a) {
			  System.out.println(i+". "+_a.getName()+" ("+_a.getEmail()+")");
			  i++;
		  }
 
	}

}
