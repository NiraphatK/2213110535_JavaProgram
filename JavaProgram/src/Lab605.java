
import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		int num[] = new int[5];
		for (int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt((JOptionPane.showInputDialog("Input number "+(i+1)+":")));
			
		}//end for
		showEven(num);
		showOdd(num);
		

	}
	public static void showEven(int[] nums) {
		String txt ="";
		for (int i=0;i<nums.length;i++) {
			if (nums[i]%2==0) {
				
				txt = txt+nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+txt);
		
	}
	public static void showOdd(int[] nums) {
		String txt ="";
		for (int i=0;i<nums.length;i++) {
			if (nums[i]%2!=0) {
				
				txt = txt+nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+txt);
	}

}
