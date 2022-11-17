import javax.swing.*;
import java.text.*;

public class MusicWorldApp {
	static final double TAX_RATE = .0625;	

	public static void main(String[] args) {
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		DecimalFormat f2 = new DecimalFormat("##.0");
		String cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD orde\nPlease 	enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		double cdSubtotal = cdPrice * cdQuantity;
		double cdTotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary of the transaction:\n"+
				"\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: "+f1.format(cdPrice)
		+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+f2.format(cdSubtotal)+"\nTax rate: "+TAX_RATE*100+"%"+
		"\nTotal: $"+cdTotal+"\n\nEnd of Program");
		
		

	}

}
