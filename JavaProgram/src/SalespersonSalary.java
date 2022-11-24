import java.text.*;
import java.util.*;
public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##,###.00");
		int sales = 0;
		double salary;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter sales in dollars (or -1 to end):");;
			sales = scan.nextInt();
			if (sales == SENTINEL) break;
		
		salary = 1000+(sales*COMMISSION_RATE);
		System.out.println("Salary is: $"+frm.format(salary));
		System.out.println();
		}
		System.out.println("bye");
	}

	

}
