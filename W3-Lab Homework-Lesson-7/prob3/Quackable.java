package lesson7.labsolns.prob5;

public interface Quackable {
	default void quack() {
		System.out.println("  quacking");
	}
}
