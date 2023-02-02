import javax.swing.JOptionPane;

public class CoffeeShopDemo1 {
	Barista staff1 = new Barista("Leon",'M');
	Barista staff2 = new Barista("Claire",'F');
	
	int chk = Integer.parseInt(JOptionPane.showInputDialog(null,"Type 1 [Hot] :\nType 2 [Cold] :"));
	
}
