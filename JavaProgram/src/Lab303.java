import javax.swing.*;
import java.util.Random;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog(null,"Your balance:"+balance+
				"\nInput money to withdraw:"));
		
		if (money > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance"
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000"
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money<100) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+money+" baht."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money%10!=0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+money%100+" baht."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else {
		int w1000 = money/1000;
		int w500 = money%1000/500;
		int w100 = money%1000%500/100;
		
		
		JOptionPane.showMessageDialog(null,"You with draw "+money+" baht."+
		"\n1,000 = "+w1000+"\n500 = "+w500+"\n100 = "+w100);
		}
		
	}

}
