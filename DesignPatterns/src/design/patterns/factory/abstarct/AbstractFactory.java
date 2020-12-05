package design.patterns.factory.abstarct;

public interface AbstractFactory<T> {
	T create(Enum<?> type);
}
