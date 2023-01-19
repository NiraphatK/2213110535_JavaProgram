import java.util.*;
public class MakeChange {

	static final int HALFDOLLAR = 50;
	static final int QUARTER = 25;
	static final int DIME = 10;
	static final int NICKEL = 5;
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the change in cents: ");
		int input = scr.nextInt();
		System.out.println();
		System.out.println("The change you entered is "+input/HALFDOLLAR);
		System.out.println("The number of half dollars to be returned is "+input);
		input = input%HALFDOLLAR;
		System.out.println("The number of quarter to be returned is "+input/QUARTER);
		input = input%QUARTER;
		System.out.println("The number of dimes to be returned is "+input/DIME);
		input = input%DIME;
		System.out.println("The number of nickles to be returned is "+input/NICKEL);
		input = input%NICKEL;
		System.out.println("The number of pennies to be returned is "+input/1);
	}

}
	