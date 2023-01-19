import javax.swing.*;
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String product_name = JOptionPane.showInputDialog("Input product name : ");		
		String product_unit_str = JOptionPane.showInputDialog("Input product unit : ");
		int product_unit = Integer.parseInt(product_unit_str);
		String product_price_str = JOptionPane.showInputDialog("Input product price : ");
		float product_price = Float.parseFloat(product_price_str);
		float total_price = product_unit*product_price;
		float total_vat = total_price+(total_price*7/100f);
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(total_price)
		+" baht."+"\nAdd VAT 7% is "+frm.format(total_vat)+" baht.");

	}

}
