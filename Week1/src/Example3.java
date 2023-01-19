import java.util.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scr = new Scanner(System.in);
		System.out.print("Input product name : ");
		String product_name = scr.nextLine();
		System.out.print("Input product unit : ");
		int product_unit = scr.nextInt();
		System.out.print("Input price per unit : ");
		float price_unit = scr.nextFloat();
		float total_price = product_unit*price_unit;
		System.out.println();
		System.out.println("Total Price is "+frm.format(total_price)+" baht.");
		float total_vat = total_price+(total_price*7/100f);
		System.out.println("Add VAT 7% is "+frm.format(total_vat)+" baht.");
	}

}
