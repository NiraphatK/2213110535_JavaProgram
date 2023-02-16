import java.util.*;
import java.io.*;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("Employee.txt"));
		char again;
		do {
			super.header();
			System.out.print("Enter name        : ");
			name = scan.next();
			System.out.print("Enter department  : ");
			dept = scan.next();
			ps.println(name + "\t" + dept);
			System.out.print("Enter data again? : ");
			again = scan.next().toLowerCase().charAt(0);
		} while (again == 'y');

	}

	public void read() {
		try (Scanner read = new Scanner(new File("Employee.txt"))){
			int i =0;
			boolean chk = false;
			super.header();
			while(read.hasNext()) {
				name = read.next();
				dept = read.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					chk = true;
				}//if
			}//while
			if (chk) {
				super.header();
				System.out.println("Employee in dept "+super.getDept()+" is "+i+" person.");
				super.header();
			}
			else {
				System.out.println("Sorry, no dept : "+super.getDept()+" in file.");
			}
			read.close();
			
		} catch (IOException e) {
			System.out.println("\nSorry, file not found...");;
		}
	}

}
