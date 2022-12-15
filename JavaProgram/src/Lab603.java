import java.util.*;

public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static int[] number = {78, 36, 58, 41, 25, 92 ,75};
	public static void main(String[] args) {
		System.out.print("Input index of array : ");
		int index = scan.nextInt();
		while (index <0 || index>(number.length-1)) {
			System.out.print("Input index of array, again : ");
			index = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+(number[index]));
		//System.out.println("Value in next	index is "+(number[index+1]));
		
		if(index==(number.length-1)) {
			System.out.println("Sorry, "+index+" is the last index in array.");
		}
		else {
			System.out.println("Value in next	index is "+(number[index+1]));
		}

	}

}
