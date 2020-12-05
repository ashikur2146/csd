package design.patterns.factory.abstarct;

public class FactoryProvider {
public static AbstractFactory<?> getFactory(Enum<?> choice){
        if(choice == FamilyProvider.ANIMAL){
            return new AnimalFactory();
        }
        else if(choice == FamilyProvider.COLOR){
            return new ColorFactory();
        }
        return null;
    }
}
