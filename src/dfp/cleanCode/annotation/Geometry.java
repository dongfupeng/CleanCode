package dfp.cleanCode.annotation;

public class Geometry {

	public double area(Object shape) {

		if(shape instanceof Shape)
			return ((Shape) shape).arae();
		else
			return new Double(0.0);
		
	}
}
