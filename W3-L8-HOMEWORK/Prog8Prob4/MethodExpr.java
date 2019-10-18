package Prog8Prob4;
import java.util.function.Supplier;
public class MethodExpr {
	public static void main(String[] args) {
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
	}
}
