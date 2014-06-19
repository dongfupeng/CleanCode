package dfp.cleanCode.annotation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGeometry {
	
	Geometry geometry;
	
	@Before
	public void setup() {
		geometry = new  Geometry();
	}
	
	@Test
	public void testSquareArea() {
		Square square =  new Square();
		square.setSide(10);
		double squareArea = geometry.area(square);
		assertEquals(100, squareArea,5);
	}
	
	@Test
	public void testRectangleArea(){
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(15) ;
		rectangle.setWidth(10);
		double rectangleArea = geometry.area(rectangle);
		assertEquals(150, rectangleArea, 2);
	}
	
	@Test
	public void testCircle(){
		Circle circle = new Circle();
		circle.setRadius(10);
		double circleArea = geometry.area(circle);
		assertEquals(314.15, circleArea, 2);
	}
	
	@Test
	public void testNoShape(){
		Object obj = new Object();
		double objArea = geometry.area(obj);
		assertEquals(0.0, objArea,2);
	}
	
}
