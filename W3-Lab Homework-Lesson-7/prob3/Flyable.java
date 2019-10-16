package lesson7.labsolns.prob5;

public interface Flyable {
	default void fly() {
		System.out.println("  flying");
	}
}
