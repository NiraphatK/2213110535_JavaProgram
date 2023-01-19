import javax.swing.*;
import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final float BUFFETPRICE = 299;
		int number_customer = 5;
		float totalprice = BUFFETPRICE*number_customer;
		System.out.println("Buffet of "+number_customer+" customers is "+frm.format(totalprice));
		float net = totalprice+(totalprice*3/100);
		System.out.println("Add Service Charge 3% is "+frm.format(net));
		JOptionPane.showMessageDialog(null, "Buffet of "+number_customer+" customers is "+frm.format(totalprice)+
				"\nAdd Service Charge 3% is "+frm.format(net));

	}

}
