package dfp.cleanCode.annotation;

import java.awt.Point;

public class Rectangle implements Shape{

	public Point topLeft;
	private double height;
	private double width;
	
	@Override
	public double arae() {
		return height*width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
}
