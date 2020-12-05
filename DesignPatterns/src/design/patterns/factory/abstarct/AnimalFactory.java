package design.patterns.factory.abstarct;


public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(Enum<?> type) {
		if (type == AnimalType.DOG) {
			return new Dog();
		} else if (type == AnimalType.DUCK) {
			return new Duck();
		} 
		return null;
	}
}
