
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn = "IB2-6325-85-4-1";
		String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		System.out.println("Book ISBN : "+isbn);	
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit : "+unit);	
		System.out.println("Book Price : "+price);
		float total = price*unit;
		System.out.println("Total price is  "+total);
		float totalvat = total+(total*7/100f);
		System.out.println("Add VAT 7% is "+totalvat);
	    
		
	}

}
