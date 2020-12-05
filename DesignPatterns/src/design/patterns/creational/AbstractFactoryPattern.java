package design.patterns.creational;

import design.patterns.factory.abstarct.AbstractFactory;
import design.patterns.factory.abstarct.Animal;
import design.patterns.factory.abstarct.AnimalType;
import design.patterns.factory.abstarct.Color;
import design.patterns.factory.abstarct.ColorType;
import design.patterns.factory.abstarct.FactoryProvider;
import design.patterns.factory.abstarct.FamilyProvider;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory<?> familyProvider = FactoryProvider.getFactory(FamilyProvider.ANIMAL);
		
		Animal duck = (Animal) familyProvider.create(AnimalType.DUCK);
		duck.getAnimal();
		Animal dog = (Animal) familyProvider.create(AnimalType.DOG);
		dog.getAnimal();
		
		AbstractFactory<?> colorProvider = FactoryProvider.getFactory(FamilyProvider.COLOR);
		Color white = (Color) colorProvider.create(ColorType.WHITE);
		white.getColor();
		Color black = (Color) colorProvider.create(ColorType.BLACK);
		black.getColor();
	}
}
