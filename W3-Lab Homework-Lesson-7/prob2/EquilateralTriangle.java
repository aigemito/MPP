package lesson7.labsolns.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;
	public EquilateralTriangle(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double[] getLengths() {
		return new double[]{side, side, side};
	}
}
