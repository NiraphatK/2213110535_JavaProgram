import java.io.IOException;
import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert or Read data? : ");
		String input = scan.next();
		while (!input.equalsIgnoreCase("insert") && !input.equalsIgnoreCase("read")) {
			System.out.print("Please text insert or read data? : ");
			input = scan.next();
		}
		SaveandOpen file = new SaveandOpen();
		if (input.equalsIgnoreCase("insert")) {
			file.insert();
		} else {
			System.out.print("\nEnter department: ");
			String department = scan.next();
			file.setDept(department);
			file.read();
		}

	}

}
