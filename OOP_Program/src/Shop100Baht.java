import javax.swing.JOptionPane;

public class Shop100Baht {
	
	public static void main(String[] args) {
		Product sold = new Product();
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, sold);
		
		int chk = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?","Input", JOptionPane.YES_NO_OPTION);
		if (chk==0) {
			sold = new PattanakarnBranch();			
		}
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, sold);
	}

}
