import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String id, String pass, int money) {
		super(id, pass);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		boolean chk = false;
		while (read.hasNext()) {
			String id = read.next();
			String pass = read.next();
			int money = read.nextInt();
			if (super.getID().equals(id) && super.getPass().equals(pass) && this.money < money) {
				chk = true;
			}

		}
		read.close();
		return chk;

	}

	public void show() throws IOException {
		if(checkBookBank()) {
			int t = this.money/1000;
			int f = t/500%500;
			int h = f/100%100;
			System.out.println();
			System.out.println(String.format("You drawing for %d, get"
					+ "\n 1000 = "+t
					+"\n 500 = "+f
					+"\n 100 = "+h
					+"\nYour balance is %d Baht.",this.money, money));
		}
		else  {
			System.err.println("Sorry, your id or password is wrong, or your amount not enough.");
		}
	}
}
