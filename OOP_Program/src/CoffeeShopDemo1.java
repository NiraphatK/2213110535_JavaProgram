import javax.swing.JOptionPane;

public class CoffeeShopDemo1 {
	public static void main(String[] args) {
		
	
	Barista staff1 = new Barista("Leon",'M');
	Barista staff2 = new Barista("Claire",'F');
	
	int chkDrink = Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 [Hot] :\nType 2 [Cold] :"));
	int chkType = Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 [Americano] :\nType 2 [Espresso] :\nType 3 [Cappuccino] :"));
	char inputSize = JOptionPane.showInputDialog(null,"Input size").toLowerCase().charAt(0);
	
	}	
}
