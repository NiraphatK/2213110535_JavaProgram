import javax.swing.JOptionPane;

public class RectangleDemo1 {;
	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog(null,"Input width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Input length : "));
		String color = JOptionPane.showInputDialog(null,"Input color : ");
		Rectangle rec = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rec+"\nArea of Rectangle is "+rec.getArea());

	}

}
