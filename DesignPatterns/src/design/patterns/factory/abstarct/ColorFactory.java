package design.patterns.factory.abstarct;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(Enum<?> type) {
		if (type == ColorType.WHITE) {
			return new White();
		} else if (type == ColorType.BLACK) {
			return new Black();
		} 
		return null;
	}

}
