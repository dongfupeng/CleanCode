package dfp.cleanCode.annotation;

import java.awt.Point;

public class Square implements Shape{

	public Point topLeft;
	private double side;
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double arae() {
		return side*side;
	}
	
}

