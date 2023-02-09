import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cy = new Cylinder[5];
		for (int i = 0; i < cy.length; i++) {
			System.out.print("Input radius and height: ");
			double rad = scan.nextDouble();
			double height = scan.nextDouble();

			cy[i] = new Cylinder(rad, height);

		}
		System.out.println();
		int i =1;
		for (Cylinder _cy : cy) {
			System.out.println("Cylinder "+i+", volume="+_cy.getVolume());
			i++;
		}

	}

}
