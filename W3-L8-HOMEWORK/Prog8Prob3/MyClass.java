package Prog8Prob3;

import java.util.function.Predicate;

public class MyClass {
	int x ;
	String y;
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}
	Predicate<MyClass> p1 = (MyClass instance) -> this.equals(instance);
	Predicate<MyClass> p2 = this::equals;
	public void myMethod(MyClass cl) {
		System.out.println("Is this instance equal to cl? " + p2.test(cl));
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		MyClass mc = (MyClass)ob;
		return mc.x == x && mc.y.equals(y);
	}

	public static void main(String[] args) {
		MyClass myclass = new MyClass(1, "Amanuel");
		MyClass myclass1 = new MyClass(1,"Biniam");
		myclass.myMethod(myclass);
		myclass.myMethod(myclass1);

	}

}
