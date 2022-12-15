import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			num[i] = scan.nextInt();
		}
		int total = sumOfPos(num);
		System.out.println("\nSummation of positive number is " + total);

	}

	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int n : nums) {
			if (n>0)
			sum += n;
		}
		return sum;

	}
}
