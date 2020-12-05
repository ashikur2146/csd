package design.patterns.creational;

import design.patterns.factory.Shape;
import design.patterns.factory.ShapeFactory;
import design.patterns.factory.ShapeType;

public class FactoryPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();
		
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
	}
}
