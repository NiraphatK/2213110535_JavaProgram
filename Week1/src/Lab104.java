import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		String minute_str = JOptionPane.showInputDialog("Input Time Parking (minute): ");	
		int minute = Integer.parseInt(minute_str);
		int calhour = minute/60;
		int calmin = minute%60;
		float  total_hour = calhour*50;
		float  total_min = calmin*0.25f;
		JOptionPane.showMessageDialog(null, "You parking "+calhour+" Hour "+calmin+" Minute."
		+"\nAmount to be paid is "+(total_hour+total_min)+" baht.");
		
	}

}
