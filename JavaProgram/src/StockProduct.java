import java.text.*;
import java.util.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat frm = new DecimalFormat("#,###.00");

	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id     : ");
			productList[i].setId(scan.next());
			
			System.out.print("Input product Unit   : ");
			productList[i].setUnit(scan.nextInt());
			while (productList[i].getUnit()<=0) {
				System.out.print("Input product Unit ,again : ");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price  : ");
			productList[i].setPrice(scan.nextDouble());
			while(productList[i].getPrice()<=0) {
				System.out.print("Input product Price ,again : ");
				productList[i].setPrice(scan.nextDouble());
			}

		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		double sum=0;
		for (Product pd : productList) {
			sum +=pd.calculate();
			System.out.println("Product ID : "+pd.getId()
			+", Total price = "+frm.format(pd.calculate())+" baht.");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Total price of all product is "+frm.format(sum)+" baht.");

	}
}
