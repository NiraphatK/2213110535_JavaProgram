import javax.swing.*;
import java.text.*;
public class MovieTicket {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.00");
		String movie_name = JOptionPane.showInputDialog("Enter the movie name");
		float movie_aprice = Float.parseFloat((JOptionPane.showInputDialog("Enter the price of an adult ticket")));
		float movie_cprice = Float.parseFloat((JOptionPane.showInputDialog("Enter the price of an child ticket")));	
		int movie_aticket = Integer.parseInt((JOptionPane.showInputDialog("Enter the number of adult tickets sold")));
		int movie_cticket = Integer.parseInt((JOptionPane.showInputDialog("Enter the number of child tickets sold")));	
		int movie_percen = Integer.parseInt((JOptionPane.showInputDialog("Enter the percenteage of the donation")));
		
	    float cal = (movie_aticket*movie_aprice)+(movie_cprice*movie_cticket);
	    float amount_d = cal*7/100f;
	    float net = cal-amount_d;
	    JOptionPane.showMessageDialog(null, "Movie Name: "+movie_name +"\nNumber of Tickets Sold: "+(movie_aticket+movie_cticket)+
	    		"\nGross Amount: $"+frm.format(cal)+"\nPercentage of the Gross Amount Donated: "
	    		+frm.format(movie_percen)+"%"+ "\nAmount Donated: $"+frm.format(amount_d)+"\nNet Sale: $"+frm.format(net),"Theater Sales Data",JOptionPane.INFORMATION_MESSAGE);
	

}
}
