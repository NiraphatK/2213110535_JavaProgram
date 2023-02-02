
public class Point2D {
	private float x;
	private float y;

	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Point2D() {
		x = y = 0.0f;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float[] getXY() {
		float[] results = new float[2];
		results[0] = x;
		results[1] = y;
		return results;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
