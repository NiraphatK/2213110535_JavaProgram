import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cy = new Cylinder[5];
		for (int i = 0; i < cy.length; i++) {
			String input = JOptionPane.showInputDialog(null, "Input radius and height :");
			String[] data = input.split(" ");
			double data_double1 = Double.parseDouble(data[0]);
			double data_double2 = Double.parseDouble(data[1]);

			cy[i] = new Cylinder(data_double1, data_double2);
		}

		JOptionPane.showMessageDialog(null,
				"Cylinder 1" + ", volume=" + cy[0].getVolume() + "\nCylinder 2 " + ", volume=" + cy[1].getVolume()
						+ "\nCylinder 3 " + ", volume=" + cy[2].getVolume() + "\nCylinder 4 " + ", volume="
						+ cy[3].getVolume() + "\nCylinder 5 " + ", volume=" + cy[4].getVolume());
	}

}
