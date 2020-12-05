package design.patterns.factory;

public class ShapeFactory {
	public Shape getShape(ShapeType shapeType) {
		if (shapeType == ShapeType.CIRCLE)
			return new Circle();
		if (shapeType == ShapeType.RECTANGLE)
			return new Rectangle();
		if (shapeType == ShapeType.SQUARE)
			return new Square();
		return null;
	}
}
