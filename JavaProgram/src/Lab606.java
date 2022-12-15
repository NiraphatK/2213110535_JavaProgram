import javax.swing.JOptionPane;

public class Lab606 {
	public static void main(String[] args) {
		int nums[] = { 25, 78, 41, 22, 36, 85, 37 };
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));		
		while (!checkIndex(nums, index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));

		}
		
		int current = currentData(nums, index);
		int prev =prevData(nums, index);
		int next =nextData(nums, index);
		JOptionPane.showMessageDialog(null,"Current data,nums["+index+"] is "+nums[current]
				+((prev<0)?"\nNo previous data " : "\nPrevious data,nums["+(index-1)+"] is "+nums[prev])
				+((next >nums.length-1)?"\nNo next data"
						:"\nNext data,nums["+(index+1)+"] is "+nums[next]));
	}
				

	

	public static boolean checkIndex(int[] nums, int index) {
		return (index >= 0 && index <(nums.length)) ? true : false;

	}

	public static int currentData(int[] nums, int index) {
		return index;
	}

	public static int prevData(int[] nums, int index) {
		return index - 1;
	}

	public static int nextData(int[] nums, int index) {
		return index + 1;
	}

}
