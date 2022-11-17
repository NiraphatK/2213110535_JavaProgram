import java.util.*;
public class Lab203 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Input two  integer(a b): ");
		int n1 = scr.nextInt();
		int n2 = scr.nextInt();
		int total = n1+n2;
		int count = 0;
		System.out.println("Sum of two integers:"+total);
		
		while (total != 0) {
			total /= 10;
			count++;
		}
		System.out.println("Digit number of sum of said  two integers:"+count);
		
	}

}
