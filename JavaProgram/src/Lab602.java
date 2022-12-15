import java.util.*;

public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static double avg=0;
	public static void main(String[] args) {
		double num[] = new double[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			num[i] = scan.nextDouble();
			avg += num[i];
		}
		avg = avg / num.length;
		System.out.println("\nAverage of " + num.length + " student is " + avg);
		for(int i =0;i<num.length;i++) {
			if(num[i]>avg) {
				System.out.println("> Student "+(i+1)+" ("+num[i]+")");
			}
		}

	}

}
