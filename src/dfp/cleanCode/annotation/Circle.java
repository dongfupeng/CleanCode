package dfp.cleanCode.annotation;

import java.awt.Point;

public class Circle implements Shape {

	public final double PI = 3.141592653589793;
	public Point center;
	private double radius;

	@Override
	public double arae() {
		return PI*radius*radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
