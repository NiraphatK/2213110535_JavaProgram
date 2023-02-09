
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,"");
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	@Override
	public String toString() {
		return "height = "+height+" , "+super.toString();
	}
	@Override
	public double getArea() {
		return 2*Math.PI*(height+getRadius());
	}
}
