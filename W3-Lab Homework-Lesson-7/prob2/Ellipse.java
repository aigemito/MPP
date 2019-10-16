package lesson7.labsolns.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double ellipIntegralAtEccentricity;
	public Ellipse(double sma, double eie) {
		semiMajorAxis = sma;
		ellipIntegralAtEccentricity = eie;
	}
	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellipIntegralAtEccentricity;
	}

}
