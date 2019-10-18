package Prog8Prob4;

import java.util.function.Supplier;

public class Inner {
	class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
	public static void main(String[] args) {
		
		Supplier<Double> supplier = (new Inner()).new MySupplier();
		System.out.println(supplier.get());
	}
	
	
}
