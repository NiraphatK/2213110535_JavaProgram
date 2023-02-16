import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ATMBanking {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.print("Enter account number : ");
		String acct = scan.next();
		while (acct.indexOf(1)!='-'&&acct.indexOf(5)!='-'&&acct.indexOf(9)!='-'&&acct.indexOf(12)!='-'&&acct.length()!=14) {
			System.out.print("Input wrong type, Enter account number : ");
			acct = scan.next();
		}
		System.out.print("Enter password : ");
		String pass = scan.next();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass = scan.next();
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money<0||money%100!=0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(acct,pass,money);
		bank.show();

	}

}
